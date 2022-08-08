package com.portfolio.turano.services;

import com.portfolio.turano.models.Experiencia;
import java.util.List;

public interface IExperienciaService {
    
    //OBTENER UNA LISTA DE EXPERIENCIAS USANDO GETTER DE LA CLASE EXPERIENCIA
    public List<Experiencia> verExperiencias ();
    
    //CREAR UNA EXPERIENCIA
    public void crearExperiencia (Experiencia exp);
    
    //BORRAR EXPERIENCIA POR ID
    public void borrarExperiencia (Long id);
    
    //BUSCAR EXPERIENCIA POR ID
    public Experiencia buscarExperiencia (Long id);
    
    //EDITAR UNA EXPERIENCIA POR ID
    public void editarExperiencia (Experiencia exp, Long id);
}
