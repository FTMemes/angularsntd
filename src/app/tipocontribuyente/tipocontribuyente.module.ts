import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { TipocontribuyenteRoutingModule } from './tipocontribuyente-routing.module';
import { TipocontribuyenteComponent } from './tipocontribuyente.component';


@NgModule({
  declarations: [
    TipocontribuyenteComponent
  ],
  imports: [
    CommonModule,
    TipocontribuyenteRoutingModule
  ]
})
export class TipocontribuyenteModule { }
