package com.portfolio.turano.models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Experiencia implements Serializable {
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)    
    private Long id;    
    
    private String name; //INCLUYE APELLIDO
    private String image;
    private String startDate;
    private String endDate;
    private String position;
    private String tasks;   
    

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

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getImage() {
        return image;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public String getPosition() {
        return position;
    }

    public String getTasks() {
        return tasks;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setTasks(String tasks) {
        this.tasks = tasks;
    }

    
}
