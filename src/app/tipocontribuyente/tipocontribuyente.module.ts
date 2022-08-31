import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ReactiveFormsModule } from '@angular/forms';
import { TipocontribuyenteRoutingModule } from './tipocontribuyente-routing.module';
import { TipocontribuyenteComponent } from './tipocontribuyente.component';


@NgModule({
  declarations: [
    TipocontribuyenteComponent
  ],
  imports: [
    CommonModule,
    ReactiveFormsModule,
    TipocontribuyenteRoutingModule
  ]
})
export class TipocontribuyenteModule { }
