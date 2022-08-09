package com.portfolio.turano.services;

import com.portfolio.turano.models.Educacion;
import java.util.List;

public interface IEducacionService {
    
    public List<Educacion> verEducaciones ();
    
    public void crearEducacion (Educacion exp);
    
    public void borrarEducacion (Long id);
    
    public Educacion buscarEducacion (Long id);
    
    public void editarEducacion (Educacion exp, Long id);
}
