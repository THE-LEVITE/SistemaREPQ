package com.repq.service.impl;

import com.repq.model.Aprendiz;
import com.repq.repository.AprendizRepository;
import com.repq.service.AprendizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AprendizServiceImpl implements AprendizService {

    @Autowired
    private AprendizRepository aprendizRepository;

    @Override
    public Aprendiz guardar(Aprendiz aprendiz) {
        return aprendizRepository.save(aprendiz);
    }

    @Override
    public Aprendiz buscarPorId(Integer id) {
        return aprendizRepository.findById(id).orElse(null);
    }

    @Override
    public Aprendiz buscarPorDocumento(String documento) {
        return aprendizRepository.findByDocumento(documento);
    }

    @Override
    public List<Aprendiz> listarPorFicha(Integer fichaId) {
        return aprendizRepository.findByFichaId(fichaId);
    }

    @Override
    public List<Aprendiz> listar() {
        return aprendizRepository.findAll();
    }
}
