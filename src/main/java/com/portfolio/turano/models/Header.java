package com.portfolio.turano.models;

import com.sun.istack.NotNull;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Id;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Header {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    @Size(min = 1, max = 200, message = "No cumple con la longitud.")
    private String backImage;
    
    @NotNull
    @Size(min = 1, max = 200, message = "No cumple con la longitud.")
    private String image;
    
    @NotNull
    @ManyToOne
    @JoinColumn(name="persona_id")
    private Persona persona;
    

    public Header() {
    }

    public Header(Long id, String backImage, String image) {
        this.id = id;
        this.backImage = backImage;
        this.image = image;
    }    
    
}
