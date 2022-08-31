import { Component, OnInit } from '@angular/core';
import { TipoContribuyente } from '../models/TipoContribuyente';
import { TipocontribuyenteService } from '../service/tipocontribuyente.service';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-tipocontribuyente',
  templateUrl: './tipocontribuyente.component.html',
  styleUrls: ['./tipocontribuyente.component.css']
})
export class TipocontribuyenteComponent implements OnInit {
  tipocontribuyentes!: TipoContribuyente[];
  form!: FormGroup;
  constructor(private service: TipocontribuyenteService, private fb:FormBuilder) {
    this.form = this.fb.group({
      nombre: [''],
      estado: ['']
    });
   }

  ngOnInit(): void {
    this.obtenerTipoContribuyentes();
  }

  obtenerTipoContribuyentes() {
    this.service.getTipoContribuyente().subscribe(data => { this.tipocontribuyentes = data; });
  }

  agregarTipoContribuyente() {
    const tipocontribuyente: any = {
      nombre: this.form.get('nombre')?.value,
      estado: this.form.get('estado')?.value
    }
    this.service.saveTipoContribuyente(tipocontribuyente).subscribe(data=>{
      this.obtenerTipoContribuyentes();
      this.form.reset();
    })
  }

  eliminarTipoContribuyentes(id: number) {
    this.service.deleteTipoContribuyente(id).subscribe(data => { this.obtenerTipoContribuyentes(); });
  }
}
