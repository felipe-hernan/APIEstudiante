
package com.APIEstudiante.controller;

import com.APIEstudiante.model.Curso;
import com.APIEstudiante.model.Tema;
import com.APIEstudiante.service.ICurso;
import com.APIEstudiante.service.ITema;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CursoTemaController {
    
    @Autowired
    public ICurso cursorepo;
    
    @Autowired
    public ITema temaRepo;
    
    
    @PostMapping("curso/crear")
    public Curso crearCurso(Curso curso){
        cursorepo.crearCurso(curso);
        return curso;
    }
    
    @PostMapping("tema/crear")
    public Tema crearCurso(Tema tema){
        temaRepo.crearTema(tema);
        return tema;
    }
    
    @GetMapping("tema/lista")
    public List<Tema> listaTemas(){
        return temaRepo.listaTema();
    }
    
    @GetMapping("curso/lista")
    public List<Curso> listaCurso(){
        return cursorepo.listaCursos();
    }
    
}
