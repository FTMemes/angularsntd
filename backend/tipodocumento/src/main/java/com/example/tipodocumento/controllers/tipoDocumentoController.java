package com.example.tipodocumento.controllers;


import com.example.tipodocumento.services.tipoDocumentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tipodocumento")
public class tipoDocumentoController {
  @Autowired
  private tipoDocumentoService tipodocumentoService;
}
