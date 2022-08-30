import { Component, OnInit } from '@angular/core';
import { TipoDocumento } from '../models/TipoDocumento';
import { ServiceService } from '../service/service.service';

@Component({
  selector: 'app-tipodocumento',
  templateUrl: './tipodocumento.component.html',
  styleUrls: ['./tipodocumento.component.css']
})
export class TipodocumentoComponent implements OnInit {

  tipodocumentos!: TipoDocumento[];
  constructor(private service: ServiceService) { }

  ngOnInit(): void {
    this.service.getTipoDocumento().subscribe(data => { this.tipodocumentos = data; })
  }

}
