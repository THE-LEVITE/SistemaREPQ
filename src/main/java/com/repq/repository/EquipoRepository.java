package com.repq.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.repq.model.Equipo;

import java.util.List;

@Repository
public interface EquipoRepository extends JpaRepository<Equipo, Integer> {

    // Verificar si un número de serie ya existe
    boolean existsByNumeroSerie(String numeroSerie);

    // Verificar si un QR ya existe
    boolean existsByCodigoQR(String codigoQR);

    // Buscar equipos por aprendiz
    List<Equipo> findByAprendizId(Integer aprendizId);

    // Buscar por nombre
    List<Equipo> findByNombreEquipoContainingIgnoreCase(String nombre);
}
