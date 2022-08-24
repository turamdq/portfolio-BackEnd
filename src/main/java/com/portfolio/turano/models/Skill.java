package com.portfolio.turano.models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Skill implements Serializable {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
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
