
import { Component, OnInit } from '@angular/core';
import { AeropuertoService } from 'src/app/general-module/servicios/aeropuerto.service';

@Component({
  selector: 'app-reservar-vuelo',
  templateUrl: './reservar-vuelo.component.html',
  styleUrls: ['./reservar-vuelo.component.scss']
})
export class ReservarVueloComponent implements OnInit {

  constructor(private aeropuertoService: AeropuertoService) { }

  ngOnInit(): void {
    this.aeropuertoService.getAeropuertosByState(1).subscribe(data => {
      console.log(data);
    })
  }

}
