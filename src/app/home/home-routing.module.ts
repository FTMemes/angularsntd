import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EntidadComponent } from '../entidad/entidad.component';
import { TipocontribuyenteComponent } from '../tipocontribuyente/tipocontribuyente.component';
import { TipodocumentoComponent } from '../tipodocumento/tipodocumento.component';

const routes: Routes = [
  // {
  //   path: 'tipodocumento', component: TipodocumentoComponent,
  //   loadChildren: () => import('../tipodocumento/tipodocumento.module').then(x => x.TipodocumentoModule)
  // },
  // {
  //   path: 'entidad', component: EntidadComponent,
  //   loadChildren: () => import('../entidad/entidad.module').then(x => x.EntidadModule)
  // },
  // {
  //   path: 'tipocontribuyente', component: TipocontribuyenteComponent,
  //   loadChildren: () => import('../tipocontribuyente/tipocontribuyente.module').then(x => x.TipocontribuyenteModule)
  // }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class HomeRoutingModule { }
