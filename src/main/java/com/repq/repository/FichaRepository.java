package com.repq.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.repq.entidad.Ficha;

@Repository
public interface FichaRepository extends JpaRepository<Ficha, Integer> {

    // Buscar por número de ficha
    Ficha findByNumeroFicha(String numeroFicha);
}
