package com.repq.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.repq.model.Administrador;

@Repository
public interface AdministradorRepository extends JpaRepository<Administrador, Integer> {

    // Para login
    Administrador findByCorreo(String correo);

    // Verificar correo único
    boolean existsByCorreo(String correo);
}
