import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { TipodocumentoRoutingModule } from './tipodocumento-routing.module';
import { TipodocumentoComponent } from './tipodocumento.component';


@NgModule({
  declarations: [
    TipodocumentoComponent
  ],
  imports: [
    CommonModule,
    TipodocumentoRoutingModule
  ]
})
export class TipodocumentoModule { }
