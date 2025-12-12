package com.repq.service.impl;

import com.repq.model.Administrador;
import com.repq.repository.AdministradorRepository;
import com.repq.service.AdministradorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdministradorServiceImpl implements AdministradorService {

	@Autowired
	private AdministradorRepository administradorRepository;

	@Override
	public Administrador guardar(Administrador administrador) {
		return administradorRepository.save(administrador);
	}

	@Override
	public Administrador buscarPorId(Integer id) {
		return administradorRepository.findById(id).orElse(null);
	}

	@Override
	public Administrador buscarPorCorreo(String correo) {
		return administradorRepository.findByCorreo(correo);
	}

	@Override
	public boolean existeCorreo(String correo) {
		return administradorRepository.existsByCorreo(correo);
	}
}
