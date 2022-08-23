package com.portfolio.turano.models;

import com.sun.istack.NotNull;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Educacion {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    
    
    
    @NotNull
    @Size(min = 1, max = 100, message = "No cumple con la longitud.")
    private String name;
    
    @NotNull
    @Size(min = 1, max = 50, message = "No cumple con la longitud.")
    private String title;
    
    private String description;
    
    private String image;
    
    @NotNull
    @ManyToOne
    @JoinColumn(name="persona_id")
    private Persona persona;

    public Educacion() {
    }

    public Educacion(Long id, String name, String title, String description, String image) {
        this.id = id;
        this.name = name;
        this.title = title;
        this.description = description;
        this.image = image;
    }      
    
}
