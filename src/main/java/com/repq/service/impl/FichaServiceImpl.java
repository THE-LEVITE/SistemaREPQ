package com.repq.service.impl;

import com.repq.model.Ficha;
import com.repq.repository.FichaRepository;
import com.repq.service.FichaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FichaServiceImpl implements FichaService {

    @Autowired
    private FichaRepository fichaRepository;

    @Override
    public Ficha guardar(Ficha ficha) {
        return fichaRepository.save(ficha);
    }

    @Override
    public List<Ficha> listar() {
        return fichaRepository.findAll();
    }

    @Override
    public Ficha buscarPorId(Integer id) {
        return fichaRepository.findById(id).orElse(null);
    }

    @Override
    public Ficha buscarPorNumeroFicha(String numero) {
        return fichaRepository.findByNumeroFicha(numero);
    }
}
