package com.portfolio.turano.repository;

import com.portfolio.turano.models.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProyectoRepository extends JpaRepository <Proyecto, Long>{
    
}
