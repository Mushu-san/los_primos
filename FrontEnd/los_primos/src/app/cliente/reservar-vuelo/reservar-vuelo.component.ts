import { VueloService } from './../../general-module/servicios/vuelo.service';
import { FormControl, FormGroup, Validators } from '@angular/forms'
import { Component, OnInit } from '@angular/core';
import { AeropuertoService } from 'src/app/general-module/servicios/aeropuerto.service';
import * as moment from 'moment';
import { MatTableDataSource } from '@angular/material/table';

@Component({
  selector: 'app-reservar-vuelo',
  templateUrl: './reservar-vuelo.component.html',
  styleUrls: ['./reservar-vuelo.component.scss']
})
export class ReservarVueloComponent implements OnInit {

  flyForm: FormGroup
  airports!: any[] 
  flys!: any[] 
  dataSource = new MatTableDataSource()
  columnas: string[] = ['idAeropuerto']

  constructor(private aeropuertoService: AeropuertoService,
    private vueloService: VueloService) { 

      this.flyForm = new FormGroup({
        aeropuertoSalida: new FormControl('', Validators.required),
        aeropuertoLlegada: new FormControl('', Validators.required),
        fechaSalida: new FormControl('', Validators.required),
        fechaLlegada: new FormControl('', Validators.required),
      })
    }

  ngOnInit(): void {
    this.aeropuertoService.getAeropuertosByState(1).subscribe(data => {
      console.log(data);
      this.airports = data;
    })
    
    
  }

  getVueloByParams(){
    const llegada = moment(this.flyForm.get('fechaLlegada')?.value).format('DD-MM-YYYY').toString()
    this.vueloService.getVuelosByParams(this.flyForm.get('aeropuertoSalida')?.value, 
    this.flyForm.get('aeropuertoLlegada')?.value,
    llegada,
    moment(this.flyForm.get('fechaSalida')?.value).format('DD-MM-YYYY').toString() ).subscribe(data => {
      console.log(data);
      this.flys = data;
    })
  }


}
