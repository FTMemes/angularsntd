package com.example.tipodocumento.repository;

import com.example.tipodocumento.entity.tipoDocumento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface tipoDocumentoRepository extends JpaRepository<tipoDocumento, Integer> {
}
