import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { ClienteModule } from './cliente/cliente.module';
import { AdministracionModule } from './administracion/administracion.module';
import { MaterialModule } from './material-module';
import { GeneralModuleModule } from './general-module/general-module.module';

@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    ClienteModule,
    AdministracionModule,
    MaterialModule,
    GeneralModuleModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
