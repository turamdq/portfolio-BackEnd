package com.portfolio.turano.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Skill {
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    
    private String name;
    private Number percent;
    private String outerStrokeColor;
    private String imageSrc;

    public Skill() {
    }

    public Skill(Long id, String name, Number percent, String outerStrokeColor, String imageSrc) {
        this.id = id;
        this.name = name;
        this.percent = percent;
        this.outerStrokeColor = outerStrokeColor;
        this.imageSrc = imageSrc;
    }
    
}
