package com.example.tipocontribuyente.service;

import com.example.tipocontribuyente.entity.TipoContribuyente;
import com.example.tipocontribuyente.repository.TipoContibuyenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoContribuyenteService {
  @Autowired
  private TipoContibuyenteRepository tipoContibuyenteRepository;

  public List<TipoContribuyente> getAll(){
    return tipoContibuyenteRepository.findAll();
  }

  public TipoContribuyente getTipoContribuyenteById(int id){
    return tipoContibuyenteRepository.findById(id).orElse(null);
  }

  public TipoContribuyente saveTipoContribuyente(TipoContribuyente tipoContribuyente){
    return tipoContibuyenteRepository.save(tipoContribuyente);
  }
  public void deleteTipoContribuyente(int id){
    tipoContibuyenteRepository.deleteById(id);
  }
}
