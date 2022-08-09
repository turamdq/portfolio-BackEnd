package com.portfolio.turano.controller;

import com.portfolio.turano.models.Persona;
import com.portfolio.turano.services.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//ACLARO QUE ES UN CONTROLADOR CON LA ANNOTATION:
@RestController
@CrossOrigin(origins="http://localhost:4200")
public class PersonaController {
    
    @Autowired
    private IPersonaService persoServ;
    
    //ANTE UNA SOLICITUD GET EN LA URL INDICADA
    @GetMapping ("/persona/ver")
    @ResponseBody
    public List<Persona> verPersonas () {
        return persoServ.verPersonas();    
    }
    
    //ANTE UNA SOLICITUD POST EN LA URL INDICADA
    //OBTENGO EL CONTENIDO DEL BODY Y LO GUARDO EN LA VARIABLE pers PARA GUARDAR
    @PostMapping ("/persona/nueva")
    public void crearPersona (@RequestBody Persona per) {
        persoServ.crearPersona(per);    
    }
    
    //ANTE UNA SOLICITUD DELETE EN LA URL INDICADA BORRO POR ID LA PERSONA
    //CON PathVariable RECIBO EN LA URL UNA VARIABLE (ID)
    @DeleteMapping ("/persona/borrar/{id}")
    public void borrarPersona (@PathVariable Long id) {
        persoServ.borrarPersona(id);
    }
    
    //ANTE UNA SOLICITUD PUT EN LA URL INDICADA EDITO POR ID LA PERSONA
    /*@PutMapping ("/persona/editar/{id}")
    public Persona editarPersona (@PathVariable Long id,
                               @RequestParam("name") String newName,
                               @RequestParam("position") String newPosition,
                               @RequestParam("about") String newAbout){
        Persona per = persoServ.buscarPersona(id);
        
        per.setName(newName);
        per.setPosition(newPosition);
        per.setAbout(newAbout);
        
        persoServ.crearPersona(per);
        return per;
    }*/
    @PutMapping("/persona/editar/{id}")
    public void editarPersona(@PathVariable("id") Long id, 
                                  @RequestBody Persona per) {
        persoServ.editarPersona(per, id);
    }     

}