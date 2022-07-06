package com.APIEstudiante.service;

import com.APIEstudiante.model.Curso;
import java.util.List;

public interface ICurso {
    public void crearCurso(Curso curso);
    public List<Curso> listaCursos();
}
