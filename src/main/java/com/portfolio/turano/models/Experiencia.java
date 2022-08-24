package com.portfolio.turano.models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Experiencia implements Serializable {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)    
    private Long id;    
    
    private String name; //INCLUYE APELLIDO
    private String image;
    private String startDate;
    private String endDate;
    private String position;
    private String tasks;   
    

    public Experiencia() {
    }

    public Experiencia(Long id, String name, String image, String startDate, String endDate, String position, String tasks) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.startDate = startDate;
        this.endDate = endDate;
        this.position = position;
        this.tasks = tasks;
    }    
}
