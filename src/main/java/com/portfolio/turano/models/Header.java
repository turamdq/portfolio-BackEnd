package com.portfolio.turano.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Header {
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
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
