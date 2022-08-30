package com.example.tipodocumento.services;

import com.example.tipodocumento.entity.TipoDocumento;
import com.example.tipodocumento.repository.TipoDocumentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoDocumentoService {
  @Autowired
  private TipoDocumentoRepository tipoDocumentoRepository;

  public List<TipoDocumento> getAll() {
    return tipoDocumentoRepository.findAll();
  }

  public TipoDocumento getTipoDocumentobyId(int id) {
    return tipoDocumentoRepository.findById(id).orElse(null);
  }

  public TipoDocumento saveTipoDocumento(TipoDocumento tipodocumento) {
    return tipoDocumentoRepository.save(tipodocumento);
  }

  public void deleteTipoDocumento(int id) {
    tipoDocumentoRepository.deleteById(id);
  }
}
