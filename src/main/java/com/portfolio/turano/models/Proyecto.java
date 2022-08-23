package com.portfolio.turano.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Proyecto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    @Size(min = 1, max = 50, message = "No cumple con la longitud.")
    private String name;
    
    @NotNull
    @Size(min = 1, max = 50, message = "No cumple con la longitud.")
    private String description;
    private String dates;
    private String image;
    private String link;
    
    @NotNull
    @ManyToOne
    @JoinColumn(name="persona_id")
    private Persona persona;

    public Proyecto() {
    }

    public Proyecto(Long id, String name, String description, String dates, String image, String link) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.dates = dates;
        this.image = image;
        this.link = link;
    }    
        
}
