package com.example.speproject.entity;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Luxuryresource {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String name;

    @Column
    private int availability;

    @ManyToMany(fetch = FetchType.EAGER)
    private List<Patient> patients;

    public Luxuryresource(String name, int availability) {
        this.name = name;
        this.availability = availability;
    }

    public Luxuryresource() {

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

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }
}
