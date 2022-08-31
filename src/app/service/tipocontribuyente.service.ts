import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { TipoContribuyente } from '../models/TipoContribuyente';

@Injectable({
  providedIn: 'root'
})
export class TipocontribuyenteService {

  tipocontribuyente!: TipoContribuyente[];
  constructor(private http: HttpClient) { }
  url = 'http://localhost:8081/api/tipocontribuyente/';

  getTipoContribuyente(): Observable<any> {
    return this.http.get(this.url);
  }

  saveTipoContribuyente(tipocontribuyente: any) {
    return this.http.post(this.url, tipocontribuyente);
  }

  updateTipoContribuyente(id: number, tipocontribuyente: any) {
    return this.http.put(this.url + id, tipocontribuyente);
  }

  deleteTipoContribuyente(id: number) {
    return this.http.delete(this.url + id);
  }
}
