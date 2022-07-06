
package com.APIEstudiante.service;

import com.APIEstudiante.model.Tema;
import java.util.List;


public interface ITema {
    public void crearTema(Tema tema);
    public List<Tema> listaTema();
}
