package com.example.entidad.repository;

import com.example.entidad.entity.Entidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
@Repository
public interface EntidadRepository extends JpaRepository<Entidad, Integer> {
}
