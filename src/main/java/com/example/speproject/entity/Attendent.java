package com.example.speproject.entity;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table
public class Attendent implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String name;


    @OneToMany(fetch = FetchType.EAGER)
    private List<Patient> patients;

    public Attendent(String name) {
        this.name = name;
    }

    public Attendent() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }





}
