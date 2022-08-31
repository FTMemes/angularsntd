package com.example.entidad.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "tb_entidad")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Entidad {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id_entidad;
  private String nro_documento;
  private String razon_social;
  private String nombre_comercial;
  private String direccion;
  private int telefono;
  private int estado;
  private int id_tipo_documento;
  private int id_tipo_contribuyente;
}
