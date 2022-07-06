package com.APIEstudiante.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Curso{
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;
    private String nombre;
    private String tipo_curso;
    private String fecha_finalizacion;
    
    @OneToMany(mappedBy = "curso")
    private List<Tema> temas;

    public Curso(Long id, String nombre, String tipo_curso, String fecha_finalizacion, List<Tema> temas) {
        this.id = id;
        this.nombre = nombre;
        this.tipo_curso = tipo_curso;
        this.fecha_finalizacion = fecha_finalizacion;
        this.temas = temas;
    }

    public Curso() {
    }
    
    public void agregarTema(Tema tema){
        if (temas==null) temas=new ArrayList<>();
        temas.add(tema);
        tema.setCurso(this);
    }
    
}
