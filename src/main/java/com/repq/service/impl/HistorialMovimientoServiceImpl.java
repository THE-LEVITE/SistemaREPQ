package com.repq.service.impl;

import com.repq.model.HistorialMovimiento;
import com.repq.repository.HistorialMovimientoRepository;
import com.repq.service.HistorialMovimientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class HistorialMovimientoServiceImpl implements HistorialMovimientoService {

    @Autowired
    private HistorialMovimientoRepository historialRepository;

    @Override
    public HistorialMovimiento guardar(HistorialMovimiento movimiento) {
        return historialRepository.save(movimiento);
    }

    @Override
    public List<HistorialMovimiento> listarPorEquipo(Integer equipoId) {
        return historialRepository.findByEquipoId(equipoId);
    }

    @Override
    public List<HistorialMovimiento> listarPorRangoFecha(LocalDateTime inicio, LocalDateTime fin) {
        return historialRepository.findByFechaHoraBetween(inicio, fin);
    }

    @Override
    public List<HistorialMovimiento> listarPorTipo(String tipo) {
        return historialRepository.findByTipoMovimiento(tipo);
    }

    @Override
    public List<HistorialMovimiento> listarPorAdmin(Integer adminId) {
        return historialRepository.findByAdministradorId(adminId);
    }

    @Override
    public List<HistorialMovimiento> listar() {
        return historialRepository.findAll();
    }
}
