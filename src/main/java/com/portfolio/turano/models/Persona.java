package com.portfolio.turano.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String name;
    private String position;
    private String about;

    public Persona() {
    }

    public Persona(Long id, String name, String position, String about) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.about = about;
    }
    
    
}
