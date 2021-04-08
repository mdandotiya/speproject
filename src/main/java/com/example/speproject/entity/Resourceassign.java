package com.example.speproject.entity;

import javax.persistence.*;

@Entity
@Table(name="Resourceassign")
public class Resourceassign {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "patientid")
    private int patientid;

    @Column(name = "resourceid")
    private int resourceid;

    public Resourceassign(int patientid, int resourceid) {
        this.patientid = patientid;
        this.resourceid = resourceid;
    }

    public Resourceassign() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPatientid() {
        return patientid;
    }

    public void setPatientid(int patientid) {
        this.patientid = patientid;
    }

    public int getResourceid() {
        return resourceid;
    }

    public void setResourceid(int resourceid) {
        this.resourceid = resourceid;
    }
}
