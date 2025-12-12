package com.repq.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.repq.entidad.Aprendiz;

import java.util.List;

@Repository
public interface AprendizRepository extends JpaRepository<Aprendiz, Integer> {

    // Buscar por documento
    Aprendiz findByDocumento(String documento);

    // Buscar todos los aprendices de una ficha
    List<Aprendiz> findByFichaId(Integer fichaId);
}
