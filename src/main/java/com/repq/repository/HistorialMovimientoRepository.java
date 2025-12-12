package com.repq.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.repq.model.HistorialMovimiento;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface HistorialMovimientoRepository extends JpaRepository<HistorialMovimiento, Integer> {

	// Buscar historial de un equipo
	List<HistorialMovimiento> findByEquipoId(Integer equipoId);

	// Buscar por rango de fechas
	List<HistorialMovimiento> findByFechaHoraBetween(LocalDateTime inicio, LocalDateTime fin);

	// Filtrar por movimiento (ENTRADA / SALIDA)
	List<HistorialMovimiento> findByTipoMovimiento(String tipoMovimiento);

	// Buscar historial hecho por un administrador
	List<HistorialMovimiento> findByAdministradorId(Integer administradorId);
}
