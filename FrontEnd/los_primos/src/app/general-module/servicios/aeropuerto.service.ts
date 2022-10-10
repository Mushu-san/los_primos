import { GeneralService } from './GeneralService';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AeropuertoService {
  url: string = 'http://localhost:8080/aeropuertos';

  constructor(private generalService: GeneralService) { }

  getAeropuertosByState(state: number): Observable<Object[]> {
    return this.generalService.getData<Object[]>(this.url + `/aeropuerto/state/${state}`);
  }


}
