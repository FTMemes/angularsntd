import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { TipoDocumento } from '../models/TipoDocumento';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class TipodocumentoService {

  tipodocumento!: TipoDocumento[];
  constructor(private http: HttpClient) { }
  url = 'http://localhost:8080/api/tipodocumento/';

  getTipoDocumento(): Observable<any> {
    return this.http.get(this.url);
  }

  saveTipoDocumento(tipodocumento: any) {
    return this.http.post(this.url, tipodocumento);
  }

  updateTipoDocumento(id: number, tipodocumento: any) {
    return this.http.put(this.url + id, tipodocumento);
  }

  deleteTipoDocumento(id: number) {
    return this.http.delete(this.url + id);
  }
}
