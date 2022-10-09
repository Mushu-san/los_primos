import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

const routes: Routes = [
  {
    path: 'administracion',
    loadChildren: () => import('./administracion/administracion.module').then(m => m.AdministracionModule)
  },
  {
    path: 'cliente',
    loadChildren : () => import('./cliente/cliente.module').then(m => m.ClienteModule)
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
