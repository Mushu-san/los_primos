import { Param } from './../clases/Params';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { GeneralService } from './GeneralService';
import * as moment from 'moment';

@Injectable({
  providedIn: 'root'
})
export class VueloService {
  url: string = 'http://localhost:8080/vuelos';

constructor(private generalService: GeneralService) { }

  getVuelosByParams(idAeropuertoSalida: number, idAeropuertoLlegada: number, 
     fechaLlegada: string, fechaSalida: string): Observable<any[]> {
      let params: Param[] = [
        {aeropuertoSalida: idAeropuertoSalida},
        {aeropuertoLlegada: idAeropuertoLlegada},
        {fechaLlegada: fechaLlegada},
        {fechaSalida: fechaSalida}
      ];

    return this.generalService.getData<any[]>(this.url + `/byReservation`, params);
  }
}
