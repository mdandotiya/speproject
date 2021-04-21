package com.example.speproject.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="Attendent")
public class Attendent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @OneToMany(fetch = FetchType.LAZY,mappedBy="attendent")
    private List<Patient> patients;

    public Attendent(String name, List<Patient> patients) {
        this.name = name;
        this.patients = patients;
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

    public List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }
}
