package com.example.tipocontribuyente.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "tb_tipo_contribuyente")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TipoContribuyente {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id_tipo_contribuyente;
  private String nombre;
  private int estado;
}
