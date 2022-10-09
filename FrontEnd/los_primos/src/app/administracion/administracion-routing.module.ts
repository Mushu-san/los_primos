import { AdministracionAeropuertoComponent } from './administracion-aeropuerto/administracion-aeropuerto.component';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

const routes: Routes = [
  { path: 'aeropuerto', component: AdministracionAeropuertoComponent}

];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class AdministracionRoutingModule { }
