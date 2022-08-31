package com.example.entidad.service;

import com.example.entidad.entity.Entidad;
import com.example.entidad.repository.EntidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntidadService {
  @Autowired
  private EntidadRepository entidadRepository;

  public List<Entidad> getAllEntidades(){
    return entidadRepository.findAll();
  }

  public Entidad getEntidadById(int id){
    return entidadRepository.findById(id).orElse(null);
  }

  public Entidad saveEntidad(Entidad entidad){
    return entidadRepository.save(entidad);
  }

  public void deleteEntidad(int id){
    entidadRepository.deleteById(id);
  }
}
