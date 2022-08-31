import { Component, OnInit } from '@angular/core';
import { Entidad } from '../models/Entidad';
import { EntidadService } from '../service/entidad.service';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-entidad',
  templateUrl: './entidad.component.html',
  styleUrls: ['./entidad.component.css']
})
export class EntidadComponent implements OnInit {
  entidades!: Entidad[];
  form!: FormGroup;
  constructor(private service: EntidadService, private fb:FormBuilder, ) {
    this.form = this.fb.group({
      nro_documento: [''],
      razon_social: [''],
      nombre_comercial: [''],
      direccion: [''],
      telefono: [''],
      estado: [''],
    });
   }

  ngOnInit(): void {
    this.obtenerEntidades();
  }
  obtenerEntidades() {
    this.service.getEntidad().subscribe(data => { this.entidades = data; });
  }

  agregarEntidad(){
    const entidad: any = {
      nro_documento: this.form.get('nro_documento')?.value,
      razon_social: this.form.get('razon_social')?.value,
      nombre_comercial: this.form.get('nombre_comercial')?.value,
      direccion: this.form.get('direccion')?.value,
      telefono: this.form.get('telefono')?.value,
      estado: this.form.get('estado')?.value,
    }

    this.service.saveEntidad(entidad).subscribe(data=>{
      this.obtenerEntidades();
      this.form.reset();
    });
  }

  eliminarEntidad(id: number) {
    this.service.deleteEntidad(id).subscribe(data => { this.obtenerEntidades(); });
  }
}
