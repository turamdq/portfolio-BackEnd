package com.portfolio.turano.controller;

import com.portfolio.turano.models.Header;
import com.portfolio.turano.services.IHeaderService;
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
public class HeaderController {
    
    @Autowired
    IHeaderService headServ;
    
    @GetMapping ("/header/ver")
    @ResponseBody
    public List<Header> verHeaders () {
        return headServ.verHeaders();    
    }    
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping ("/header/nueva")
    public void crearHeader (@RequestBody Header head) {
        headServ.crearHeader(head);    
    }    
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping ("/header/borrar/{id}")
    public void borrarHeader (@PathVariable Long id) {
        headServ.borrarHeader(id);
    }    
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/header/editar/{id}")
    public void editarHeader(@PathVariable("id") Long id, 
                                  @RequestBody Header head) {
        headServ.editarHeader(head, id);        
    }
}
