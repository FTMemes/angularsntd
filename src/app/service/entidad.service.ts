import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Entidad } from '../models/Entidad';

@Injectable({
  providedIn: 'root'
})

export class EntidadService {
  entidad!: Entidad[];
  constructor(private http: HttpClient) { }
  url = 'http://localhost:8082/api/entidad/';

  getEntidad(): Observable<any> {
    return this.http.get(this.url);
  }

  saveEntidad(entidad: any) {
    return this.http.post(this.url, entidad);
  }

  updateEntidad(id: number, entidad: any) {
    return this.http.put(this.url + id, entidad);
  }

  deleteEntidad(id: number): Observable<any> {
    return this.http.delete(this.url + id);
  }
}
