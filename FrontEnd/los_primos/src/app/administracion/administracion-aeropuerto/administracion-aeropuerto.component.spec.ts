import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AdministracionAeropuertoComponent } from './administracion-aeropuerto.component';

describe('AdministracionAeropuertoComponent', () => {
  let component: AdministracionAeropuertoComponent;
  let fixture: ComponentFixture<AdministracionAeropuertoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AdministracionAeropuertoComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AdministracionAeropuertoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
