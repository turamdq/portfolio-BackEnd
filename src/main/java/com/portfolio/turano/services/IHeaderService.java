package com.portfolio.turano.services;

import com.portfolio.turano.models.Header;
import java.util.List;

public interface IHeaderService {
    
    //OBTENER UNA LISTA DE EXPERIENCIAS USANDO GETTER DE LA CLASE EXPERIENCIA
    public List<Header> verHeaders ();
    
    //CREAR UNA EXPERIENCIA
    public void crearHeader (Header head);
    
    //BORRAR EXPERIENCIA POR ID
    public void borrarHeader (Long id);
    
    //BUSCAR EXPERIENCIA POR ID
    public Header buscarHeader (Long id);
    
    //EDITAR UNA EXPERIENCIA POR ID
    public void editarHeader (Header head, Long id);
}
