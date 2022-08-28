package com.example.tipodocumento.services;

import com.example.tipodocumento.entity.tipoDocumento;
import com.example.tipodocumento.repository.tipoDocumentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class tipoDocumentoService {
  @Autowired
  private tipoDocumentoRepository tipodocumentoRepository;

  public List<tipoDocumento> getAll() {
    return tipodocumentoRepository.findAll();
  }

  public tipoDocumento getTipoDocumentobyId(int id) {
    return tipodocumentoRepository.findById(id).orElse(null);
  }

  public tipoDocumento saveTipoDocumento(tipoDocumento tipodocumento) {
    return tipodocumentoRepository.save(tipodocumento);
  }

  public void deleteTipoDocumento(tipoDocumento tipodocumento){
    tipodocumentoRepository.delete(tipodocumento);
    return;
  }
}
