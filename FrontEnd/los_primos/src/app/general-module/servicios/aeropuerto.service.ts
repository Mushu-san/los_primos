import { GeneralService } from './GeneralService';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AeropuertoService {
  url: string = 'http://localhost:8080/aeropuertos';

  constructor(private generalService: GeneralService) { }

  getAeropuertosByState(state: number): Observable<any[]> {
    console.log(this.url + `aeropuertos/${state}`);
    
    return this.generalService.getData<any[]>(this.url + `/aeropuerto/state/${state}`);
  }


}
