package com.repq.service;

import com.repq.model.Administrador;

public interface AdministradorService {

    Administrador guardar(Administrador administrador);

    Administrador buscarPorId(Integer id);

    Administrador buscarPorCorreo(String correo);

    boolean existeCorreo(String correo);
}
