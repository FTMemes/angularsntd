package com.example.tipodocumento.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "tb_tipo_documento")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TipoDocumento {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id_tipo_documento;
  private String codigo;
  private String nombre;
  private String descripcion;
  private char estado;
}
