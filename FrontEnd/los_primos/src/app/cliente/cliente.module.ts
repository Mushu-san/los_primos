import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { ClienteRoutingModule } from './cliente-routing.module';
import { MaterialModule } from '../material-module';
import { ReservarVueloComponent } from './reservar-vuelo/reservar-vuelo.component';


@NgModule({
  declarations: [
    ReservarVueloComponent
  ],
  imports: [
    CommonModule,
    ClienteRoutingModule,
    MaterialModule
  ]
})
export class ClienteModule { }
