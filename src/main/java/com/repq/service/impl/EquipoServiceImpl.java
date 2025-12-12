package com.repq.service.impl;

import com.repq.model.Equipo;
import com.repq.repository.EquipoRepository;
import com.repq.service.EquipoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipoServiceImpl implements EquipoService {

	@Autowired
	private EquipoRepository equipoRepository;

	@Override
	public Equipo guardar(Equipo equipo) {
		return equipoRepository.save(equipo);
	}

	@Override
	public Equipo buscarPorId(Integer id) {
		return equipoRepository.findById(id).orElse(null);
	}

	@Override
	public boolean existeSerie(String serie) {
		return equipoRepository.existsByNumeroSerie(serie);
	}

	@Override
	public boolean existeQR(String qr) {
		return equipoRepository.existsByCodigoQR(qr);
	}

	@Override
	public List<Equipo> listarPorAprendiz(Integer aprendizId) {
		return equipoRepository.findByAprendizId(aprendizId);
	}

	@Override
	public List<Equipo> buscarPorNombre(String nombre) {
		return equipoRepository.findByNombreEquipoContainingIgnoreCase(nombre);
	}

	@Override
	public List<Equipo> listar() {
		return equipoRepository.findAll();
	}
}
