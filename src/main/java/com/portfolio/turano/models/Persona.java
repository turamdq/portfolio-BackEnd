package com.portfolio.turano.models;


import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona implements Serializable {
    
    //DEFINO ID (PK) QUE SE GENERE DE FORMA AUTO
    //ATRIBUTOS
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    //NotNull EL CAMPO NO PUEDE ESTAR VACIO
    @NotNull
    @Size(min = 1, max = 50, message = "No cumple con la longitud.")
    private String name;
    
    @NotNull
    @Size(min = 1, max = 50, message = "No cumple con la longitud.")
    private String position;
    
    @NotNull
    @Size(min = 1, max = 300, message = "No cumple con la longitud.")
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
