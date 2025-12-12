package com.repq.service;

import java.util.List;

import com.repq.model.Equipo;

public interface EquipoService {

    Equipo guardar(Equipo equipo);

    Equipo buscarPorId(Integer id);

    boolean existeSerie(String serie);

    boolean existeQR(String qr);

    List<Equipo> listarPorAprendiz(Integer aprendizId);

    List<Equipo> buscarPorNombre(String nombre);

    List<Equipo> listar();
}
