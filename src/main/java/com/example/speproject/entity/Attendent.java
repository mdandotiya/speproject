package com.example.speproject.entity;

import javax.persistence.*;

@Entity
@Table(name="Attendent")
public class Attendent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "patientid")
    private int patientid;

    public Attendent(String name, int patientid) {
        this.name = name;
        this.patientid = patientid;
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

    public int getPatientid() {
        return patientid;
    }

    public void setPatientid(int patientid) {
        this.patientid = patientid;
    }
}
