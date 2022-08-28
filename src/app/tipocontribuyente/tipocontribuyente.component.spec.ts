import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TipocontribuyenteComponent } from './tipocontribuyente.component';

describe('TipocontribuyenteComponent', () => {
  let component: TipocontribuyenteComponent;
  let fixture: ComponentFixture<TipocontribuyenteComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TipocontribuyenteComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(TipocontribuyenteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
