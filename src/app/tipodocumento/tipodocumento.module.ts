import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { TipodocumentoRoutingModule } from './tipodocumento-routing.module';
import { TipodocumentoComponent } from './tipodocumento.component';
import { ReactiveFormsModule } from '@angular/forms';


@NgModule({
  declarations: [
    TipodocumentoComponent
  ],
  imports: [
    CommonModule,
    ReactiveFormsModule,
    TipodocumentoRoutingModule
  ]
})
export class TipodocumentoModule { }
