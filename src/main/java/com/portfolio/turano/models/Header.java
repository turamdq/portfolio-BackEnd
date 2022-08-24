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
public class Header implements Serializable {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String backImage;
    private String image;

    public Header() {
    }

    public Header(Long id, String backImage, String image) {
        this.id = id;
        this.backImage = backImage;
        this.image = image;
    }    
    
}
