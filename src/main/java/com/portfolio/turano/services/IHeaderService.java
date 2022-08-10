package com.portfolio.turano.services;

import com.portfolio.turano.models.Header;
import java.util.List;

public interface IHeaderService {    
   
    public List<Header> verHeaders ();    
    
    public void crearHeader (Header head);    
    
    public void borrarHeader (Long id);    
    
    public Header buscarHeader (Long id);    
    
    public void editarHeader (Header head, Long id);
}
