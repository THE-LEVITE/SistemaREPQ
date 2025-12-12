package com.repq.service;

import java.time.LocalDateTime;
import java.util.List;

import com.repq.model.HistorialMovimiento;

public interface HistorialMovimientoService {

    HistorialMovimiento guardar(HistorialMovimiento movimiento);

    List<HistorialMovimiento> listarPorEquipo(Integer equipoId);

    List<HistorialMovimiento> listarPorRangoFecha(LocalDateTime inicio, LocalDateTime fin);

    List<HistorialMovimiento> listarPorTipo(String tipo);

    List<HistorialMovimiento> listarPorAdmin(Integer adminId);

    List<HistorialMovimiento> listar();
}
