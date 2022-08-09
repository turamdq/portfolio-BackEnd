package com.portfolio.turano.controller;

import com.portfolio.turano.models.Educacion;
import com.portfolio.turano.services.IEducacionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class EducacionController {
    
    @Autowired
    private IEducacionService eduServ;
    
    @GetMapping ("/educacion/ver")
    @ResponseBody
    public List<Educacion> verEducacions () {
        return eduServ.verEducaciones();    
    }    
    
    @PostMapping ("/educacion/nueva")
    public void crearEducacion (@RequestBody Educacion exp) {
        eduServ.crearEducacion(exp);    
    }    
    
    @DeleteMapping ("/educacion/borrar/{id}")
    public void borrarEducacion (@PathVariable Long id) {
        eduServ.borrarEducacion(id);
    }    
    
    @PutMapping("/educacion/editar/{id}")
    public void editarEducacion(@PathVariable("id") Long id, 
                                  @RequestBody Educacion exp) {
        eduServ.editarEducacion(exp, id);        
    }
}
