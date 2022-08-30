import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { TipoDocumento } from '../models/TipoDocumento';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ServiceService {
  tipodocumento!: TipoDocumento[];
  constructor(private http: HttpClient) { }
  url = 'http://localhost:8080/api/tipodocumento';
  getTipoDocumento(): Observable<any> {
    return this.http.get(this.url);
  }
}
