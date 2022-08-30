package com.example.tipodocumento.controllers;


import com.example.tipodocumento.entity.TipoDocumento;
import com.example.tipodocumento.services.TipoDocumentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tipodocumento")
public class TipoDocumentoController {
  @Autowired
  private TipoDocumentoService tipoDocumentoService;

  @GetMapping
  public ResponseEntity<List<TipoDocumento>> getAllTipoDocumento() {
    List<TipoDocumento> tipoDocumentos = tipoDocumentoService.getAll();
    if (tipoDocumentos.isEmpty()) {
      return ResponseEntity.noContent().build();
    }
    return ResponseEntity.ok(tipoDocumentos);
  }

  @GetMapping("/{id}")
  public ResponseEntity<TipoDocumento> getTipoDocumentoById(@PathVariable("id") int id) {
    TipoDocumento tipoDocumento = tipoDocumentoService.getTipoDocumentobyId(id);
    if (tipoDocumento == null) {
      return ResponseEntity.notFound().build();
    }
    return ResponseEntity.ok(tipoDocumento);
  }

  @PostMapping
  public ResponseEntity<TipoDocumento> saveTipoDocumento(@RequestBody TipoDocumento tipoDocumento) {
    TipoDocumento newTipoDocumento = tipoDocumentoService.saveTipoDocumento(tipoDocumento);
    return ResponseEntity.ok(newTipoDocumento);
  }

  @PutMapping("/{id}")
  public ResponseEntity<TipoDocumento> updateTipoDocumento(@RequestBody TipoDocumento tipoDocumentoDetails, @PathVariable(value = "id") int id) {
    TipoDocumento tipoDocumento = tipoDocumentoService.getTipoDocumentobyId(id);
    if (tipoDocumento == null) {
      return ResponseEntity.notFound().build();
    }
    tipoDocumento.setCodigo(tipoDocumentoDetails.getCodigo());
    tipoDocumento.setNombre(tipoDocumentoDetails.getNombre());
    tipoDocumento.setEstado(tipoDocumentoDetails.getEstado());
    tipoDocumento.setDescripcion(tipoDocumentoDetails.getDescripcion());

    return ResponseEntity.status(HttpStatus.CREATED).body(tipoDocumentoService.saveTipoDocumento(tipoDocumento));
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<TipoDocumento> deleteTipoDocumento(@PathVariable(value = "id") int id) {
    if (tipoDocumentoService.getTipoDocumentobyId(id) == null){
      return ResponseEntity.notFound().build();
    }
    tipoDocumentoService.deleteTipoDocumento(id);
    return ResponseEntity.ok().build();
  }
}

