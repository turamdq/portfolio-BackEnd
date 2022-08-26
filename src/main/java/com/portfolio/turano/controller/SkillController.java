package com.portfolio.turano.controller;

import com.portfolio.turano.models.Skill;
import com.portfolio.turano.services.ISkillService;
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
public class SkillController {
    
    @Autowired
    private ISkillService skillServ;
    
    @GetMapping ("/skill/ver")
    @ResponseBody
    public List<Skill> verSkills () {
        return skillServ.verSkills();    
    }    
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping ("/skill/nueva")
    public void crearSkill (@RequestBody Skill skill) {
        skillServ.crearSkill(skill);    
    }    
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping ("/skill/borrar/{id}")
    public void borrarSkill (@PathVariable Long id) {
        skillServ.borrarSkill(id);
    }    
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/skill/editar/{id}")
    public void editarSkill(@PathVariable("id") Long id, 
                                  @RequestBody Skill skill) {
        skillServ.editarSkill(skill, id);        
    }
}
