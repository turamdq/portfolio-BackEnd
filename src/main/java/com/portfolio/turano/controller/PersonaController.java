package com.portfolio.turano.controller;

import com.portfolio.turano.models.Persona;
import com.portfolio.turano.services.IPersonaService;
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
public class PersonaController {
    
    @Autowired
    private IPersonaService persoServ;
    
    @GetMapping ("/persona/ver")
    @ResponseBody
    public List<Persona> verPersonas () {
        return persoServ.verPersonas();    
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping ("/persona/nueva")
    public void crearPersona (@RequestBody Persona per) {
        persoServ.crearPersona(per);    
    }    
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping ("/persona/borrar/{id}")
    public void borrarPersona (@PathVariable Long id) {
        persoServ.borrarPersona(id);
    }    
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/persona/editar/{id}")
    public void editarPersona(@PathVariable("id") Long id, 
                                  @RequestBody Persona per) {
        persoServ.editarPersona(per, id);
    }
    
     @GetMapping("persona/traer/perfil")
    public Persona findPersona(){
        return persoServ.findPersona((long)1);
    }

}