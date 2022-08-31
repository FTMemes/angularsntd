package com.example.tipocontribuyente.controller;

import com.example.tipocontribuyente.entity.TipoContribuyente;
import com.example.tipocontribuyente.service.TipoContribuyenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.image.TileObserver;
import java.util.List;

@RestController
@RequestMapping("/api/tipocontribuyente")
public class TipoContribuyenteController {
  @Autowired
  private TipoContribuyenteService tipoContribuyenteService;

  @GetMapping
  public ResponseEntity<List<TipoContribuyente>> getAllTipoContribuyente() {
    List<TipoContribuyente> tipoContribuyentes = tipoContribuyenteService.getAll();
    if (tipoContribuyentes.isEmpty()) {
      return ResponseEntity.noContent().build();
    }
    return ResponseEntity.ok(tipoContribuyentes);
  }

  @GetMapping("/{id}")
  public ResponseEntity<TipoContribuyente> getTipoContribuyenteById(@PathVariable(value = "id") int id) {
    TipoContribuyente tipoContribuyente = tipoContribuyenteService.getTipoContribuyenteById(id);
    if (tipoContribuyente == null) {
      return ResponseEntity.notFound().build();
    }
    return ResponseEntity.ok(tipoContribuyente);
  }

  @PostMapping
  public ResponseEntity<TipoContribuyente> saveTipoContribuyente(@RequestBody TipoContribuyente tipoContribuyente) {
    TipoContribuyente newTipoContribuyente = tipoContribuyenteService.saveTipoContribuyente(tipoContribuyente);
    return ResponseEntity.ok(newTipoContribuyente);
  }

  @PutMapping("/{id}")
  public ResponseEntity<TipoContribuyente> updateTipoContribuyente(@PathVariable int id, TipoContribuyente tipoContribuyenteDetails) {
    TipoContribuyente tipoContribuyente = tipoContribuyenteService.getTipoContribuyenteById(id);
    if (tipoContribuyente == null) {
      return ResponseEntity.notFound().build();
    }
    tipoContribuyente.setNombre(tipoContribuyenteDetails.getNombre());
    tipoContribuyente.setEstado(tipoContribuyenteDetails.getEstado());
    return ResponseEntity.status(HttpStatus.CREATED).body(tipoContribuyenteService.saveTipoContribuyente(tipoContribuyente));
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<TipoContribuyente> deleteTipoContribuyente(@PathVariable(value = "id") int id) {
    if (tipoContribuyenteService.getTipoContribuyenteById(id) == null) {
      return ResponseEntity.notFound().build();
    }
    tipoContribuyenteService.deleteTipoContribuyente(id);
    return ResponseEntity.ok().build();
  }
}
