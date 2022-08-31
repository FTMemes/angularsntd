import { HttpClientModule } from '@angular/common/http';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { TipoDocumento } from './models/TipoDocumento';
import { EntidadService } from './service/entidad.service';
import { ReactiveFormsModule } from '@angular/forms';
import { TipocontribuyenteService } from './service/tipocontribuyente.service';
import { TipodocumentoService } from './service/tipodocumento.service';


@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    ReactiveFormsModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [
    TipocontribuyenteService,
    EntidadService,
    TipodocumentoService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
