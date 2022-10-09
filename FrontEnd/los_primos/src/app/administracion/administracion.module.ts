import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { AdministracionRoutingModule } from './administracion-routing.module';
import { AdministracionAeropuertoComponent } from './administracion-aeropuerto/administracion-aeropuerto.component';
import { MaterialModule } from '../material-module';


@NgModule({
  declarations: [
    AdministracionAeropuertoComponent
  ],
  imports: [
    CommonModule,
    AdministracionRoutingModule,
    MaterialModule
  ]
})
export class AdministracionModule { }
