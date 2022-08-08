package com.portfolio.turano.controller;

import com.portfolio.turano.models.Experiencia;
import com.portfolio.turano.services.IExperienciaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExperienciaController {
    
    @Autowired
    private IExperienciaService expServ;
    
    //ANTE UNA SOLICITUD GET EN LA URL INDICADA
    @GetMapping ("/ver/experiencias")
    @ResponseBody
    public List<Experiencia> verExperiencias () {
        return expServ.verExperiencias();    
    }
    
    //ANTE UNA SOLICITUD POST EN LA URL INDICADA
    //OBTENGO EL CONTENIDO DEL BODY Y LO GUARDO EN LA VARIABLE pers PARA GUARDAR
    @PostMapping ("/nueva/experiencia")
    public void crearExperiencia (@RequestBody Experiencia exp) {
        expServ.crearExperiencia(exp);    
    }
    
    //ANTE UNA SOLICITUD DELETE EN LA URL INDICADA BORRO POR ID LA EXPERIENCIA
    //CON PathVariable RECIBO EN LA URL UNA VARIABLE (ID)
    @DeleteMapping ("/borrar/experiencia/{id}")
    public void borrarExperiencia (@PathVariable Long id) {
        expServ.borrarExperiencia(id);
    }
    
    //ANTE UNA SOLICITUD PUT EN LA URL INDICADA EDITO POR ID LA EXPERIENCIA
    
    
    
    //Editar experiencia
    //@PreAuthorize("HasRole('ROLE_ADMIN')")
    @PutMapping("/editar/experiencia/{id}")
    public void editarExperiencia(@PathVariable("id") Long id, 
                                  @RequestBody Experiencia exp) {
        expServ.editarExperiencia(exp, id);
        //return new ResponseEntity<>(expUpdate, HttpStatus.OK);
    }
    
    
    
    
    
    
    
    
    //@PutMapping ("/editar/experiencia/{id}")
    //public void editarExperiencia (@RequestBody Experiencia exp,
     //                              @PathVariable Long id) {
    //    expServ.editarExperiencia(exp, id);
    /*public Persona editarPersona (@PathVariable Long id,
                               @RequestParam("name") String newName,
                               @RequestParam("position") String newPosition,
                               @RequestParam("about") String newAbout){
        Persona per = expServ.buscarPersona(id);
        
        per.setName(newName);
        per.setPosition(newPosition);
        per.setAbout(newAbout);
        
        expServ.crearPersona(per);
        return per;*/
    //}
}
