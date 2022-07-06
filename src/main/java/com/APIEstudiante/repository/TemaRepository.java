package com.APIEstudiante.repository;

import com.APIEstudiante.model.Tema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TemaRepository extends JpaRepository<Tema,Long>{
    
}
