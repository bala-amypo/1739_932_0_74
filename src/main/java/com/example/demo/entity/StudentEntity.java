package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private float cgpa;

    public void setName(String name){
        this.name=name;
    }
    public string getName(String name){
        return this.name;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void getEmail(String email){
        return this.email;
    }
    public void setCgpa(String cgpa){
        this.cgpa=cgpa;
    }public void getCgpa(String cgpa){
        return this.cgpa;
    }
}