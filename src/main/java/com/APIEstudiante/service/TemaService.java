package com.APIEstudiante.service;

import com.APIEstudiante.model.Tema;
import com.APIEstudiante.repository.TemaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TemaService implements ITema {

    @Autowired
    private TemaRepository repoTema;
    
    @Override
    public void crearTema(Tema tema) {
        repoTema.save(tema);
    }

    @Override
    public List<Tema> listaTema() {
        return repoTema.findAll();
    }
    
}
