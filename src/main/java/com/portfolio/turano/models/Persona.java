package com.portfolio.turano.models;

import com.sun.istack.NotNull;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {
    
    //DEFINO ID (PK) QUE SE GENERE DE FORMA AUTO
    //ATRIBUTOS
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    //NotNull EL CAMPO NO PUEDE ESTAR VACIO
    @NotNull
    private String name;
    @NotNull
    private String position;
    @NotNull
    private String about;
    
    //CONSTRUCTORES
    public Persona() {
    }

    public Persona(Long id, String name, String position, String about) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.about = about;
    }
    
    
}
