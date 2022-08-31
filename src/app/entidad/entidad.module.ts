import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { EntidadRoutingModule } from './entidad-routing.module';
import { EntidadComponent } from './entidad.component';
import { ReactiveFormsModule } from '@angular/forms';


@NgModule({
  declarations: [
    EntidadComponent
  ],
  imports: [
    CommonModule,
    ReactiveFormsModule,
    EntidadRoutingModule
  ]
})
export class EntidadModule { }
