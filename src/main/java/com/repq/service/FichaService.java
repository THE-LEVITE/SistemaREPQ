package com.repq.service;

import java.util.List;

import com.repq.model.Ficha;

public interface FichaService {

    Ficha guardar(Ficha ficha);

    List<Ficha> listar();

    Ficha buscarPorId(Integer id);

    Ficha buscarPorNumeroFicha(String numero);
}
