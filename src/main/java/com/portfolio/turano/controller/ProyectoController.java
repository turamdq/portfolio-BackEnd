package com.portfolio.turano.controller;

import com.portfolio.turano.models.Proyecto;
import com.portfolio.turano.services.IProyectoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
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
@CrossOrigin(origins="https://frontendturano.web.app")
public class ProyectoController {
    
    @Autowired
    private IProyectoService proyectoServ;
    
    @GetMapping ("/proyecto/ver")
    @ResponseBody
    public List<Proyecto> verProyectos () {
        return proyectoServ.verProyectos();    
    }    
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping ("/proyecto/nueva")
    public void crearProyecto (@RequestBody Proyecto proyecto) {
        proyectoServ.crearProyecto(proyecto);    
    }    
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping ("/proyecto/borrar/{id}")
    public void borrarProyecto (@PathVariable Long id) {
        proyectoServ.borrarProyecto(id);
    }    
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/proyecto/editar/{id}")
    public void editarProyecto(@PathVariable("id") Long id, 
                                  @RequestBody Proyecto proyecto) {
        proyectoServ.editarProyecto(proyecto, id);        
    }
}
