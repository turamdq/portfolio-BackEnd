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
public class Experiencia {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    @Size(min = 1, max = 50, message = "No cumple con la longitud.")
    private String name; //INCLUYE APELLIDO
    private String image;
    private String startDate;
    private String endDate;
    
    @NotNull
    @Size(min = 1, max = 50, message = "No cumple con la longitud.")
    private String position;
    
    @NotNull
    @Size(min = 1, max = 200, message = "No cumple con la longitud.")
    private String tasks;
    
    @NotNull
    @ManyToOne
    @JoinColumn(name="persona_id")
    private Persona persona;

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
