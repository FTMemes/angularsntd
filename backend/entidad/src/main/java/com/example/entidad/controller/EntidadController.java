package com.example.entidad.controller;

import com.example.entidad.entity.Entidad;
import com.example.entidad.service.EntidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/entidad")
public class EntidadController {
  @Autowired
  private EntidadService entidadService;

  @GetMapping
  public ResponseEntity<List<Entidad>> getAllEntidades() {
    List<Entidad> entidads = entidadService.getAllEntidades();
    if (entidads.isEmpty()) {
      return ResponseEntity.noContent().build();
    }
    return ResponseEntity.ok(entidads);
  }

  @GetMapping("/{id}")
  public ResponseEntity<Entidad> getEntidadById(@PathVariable(value = "id") int id) {
    Entidad entidad = entidadService.getEntidadById(id);
    if (entidad == null) {
      return ResponseEntity.notFound().build();
    }
    return ResponseEntity.ok(entidad);
  }

  @PostMapping
  public ResponseEntity<Entidad> saveEntidad(@RequestBody Entidad entidad) {
    Entidad newEntidad = entidadService.saveEntidad(entidad);
    return ResponseEntity.ok(entidad);
  }

  @PutMapping("/{id}")
  public ResponseEntity<Entidad> updateEntidad(@RequestBody Entidad entidadDetails,@PathVariable(value = "id") int id){
    Entidad entidad = entidadService.getEntidadById(id);
    if(entidad == null){
      return ResponseEntity.notFound().build();
    }
    entidad.setNro_documento(entidadDetails.getNro_documento());
    entidad.setRazon_social(entidadDetails.getRazon_social());
    entidad.setNombre_comercial(entidadDetails.getNombre_comercial());
    entidad.setDireccion(entidadDetails.getDireccion());
    entidad.setTelefono(entidadDetails.getTelefono());
    entidad.setEstado(entidadDetails.getEstado());

    return ResponseEntity.status(HttpStatus.CREATED).body(entidadService.saveEntidad(entidad));
  }
  @DeleteMapping("/{id}")
  public ResponseEntity<Entidad> deleteEntidad(@PathVariable(value = "id") int id){
    if(entidadService.getEntidadById(id) == null){
      return ResponseEntity.notFound().build();
    }
    entidadService.deleteEntidad(id);
    return ResponseEntity.ok().build();
  }
}
