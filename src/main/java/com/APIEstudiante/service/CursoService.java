
package com.APIEstudiante.service;

import com.APIEstudiante.model.Curso;
import com.APIEstudiante.repository.CursoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CursoService  implements ICurso{

    @Autowired
    private CursoRepository repoCurso;
    
    @Override
    public void crearCurso(Curso curso) {
        repoCurso.save(curso);
    }

    @Override
    public List<Curso> listaCursos() {
        return  repoCurso.findAll();
    }
    
}
