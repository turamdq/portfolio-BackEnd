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
public class Proyecto implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    private String description;
    private String dates;
    private String image;
    private String link;
    
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
