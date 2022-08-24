package com.portfolio.turano.models;

import com.sun.istack.NotNull;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Educacion implements Serializable {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    private String title;
    private String description;
    private String image;

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
