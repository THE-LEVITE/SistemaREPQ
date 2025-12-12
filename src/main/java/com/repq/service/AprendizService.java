package com.repq.service;

import java.util.List;

import com.repq.model.Aprendiz;

public interface AprendizService {

    Aprendiz guardar(Aprendiz aprendiz);

    Aprendiz buscarPorId(Integer id);

    Aprendiz buscarPorDocumento(String documento);

    List<Aprendiz> listarPorFicha(Integer fichaId);

    List<Aprendiz> listar();
}
