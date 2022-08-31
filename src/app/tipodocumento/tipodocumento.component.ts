import { Component, OnInit } from '@angular/core';
import { TipoDocumento } from '../models/TipoDocumento';
import { TipodocumentoService } from '../service/tipodocumento.service';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-tipodocumento',
  templateUrl: './tipodocumento.component.html',
  styleUrls: ['./tipodocumento.component.css']
})
export class TipodocumentoComponent implements OnInit {

  tipodocumentos!: TipoDocumento[];
  form!: FormGroup;
  constructor(private service: TipodocumentoService, private fb: FormBuilder) {
    this.form = this.fb.group({
      codigo: [''],
      nombre: [''],
      descripcion: [''],
      estado: [''],
    });
   }

  ngOnInit(): void {
    this.obtenerTipoDocumentos();
  }

  obtenerTipoDocumentos(){
    this.service.getTipoDocumento().subscribe(data => { this.tipodocumentos = data; });
  }

  agregarTipoDocumento(){
    const tipodocumento: any = {
      codigo: this.form.get('codigo')?.value,
      nombre: this.form.get('nombre')?.value,
      descripcion: this.form.get('descripcion')?.value,
      estado: this.form.get('estado')?.value,
    }
    this.service.saveTipoDocumento(tipodocumento).subscribe(data=>{
      this.obtenerTipoDocumentos();
      this.form.reset();
    })
  }

  eliminarTipoDocumento(id:number){
    this.service.deleteTipoDocumento(id).subscribe(data=>{this.obtenerTipoDocumentos();});
  }
}
