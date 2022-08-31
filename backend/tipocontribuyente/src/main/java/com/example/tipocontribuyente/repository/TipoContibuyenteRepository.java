package com.example.tipocontribuyente.repository;

import com.example.tipocontribuyente.entity.TipoContribuyente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoContibuyenteRepository extends JpaRepository<TipoContribuyente, Integer> {
}
