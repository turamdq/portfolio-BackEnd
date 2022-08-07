package com.portfolio.turano.services;

import com.portfolio.turano.models.Persona;
import java.util.List;


//EN ESTA INTERFACE DECLARO LOS METODOS PERO NO LOS IMPLEMENTO (INTERFACE)
public interface IPersonaService {
    
    //OBTENER UNA LISTA DE PERSONAS USANDO GETTER DE LA CLASE PERSONA
    public List<Persona> verPersonas ();
    
    //CREAR UNA PERSONA
    public void crearPersona (Persona per);
    
    //BORRAR PERSONA POR ID
    public void borrarPersona (Long id);
    
    //BUSCAR PERSONA POR ID
    public Persona buscarPersona (Long id);
}
