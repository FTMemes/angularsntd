package com.example.tipodocumento.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class tipoDocumento {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id_tipo_documento;
  private String codigo;
  private String nombre;
  private String description;
  private char estado;
}
