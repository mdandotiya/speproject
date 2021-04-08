package com.example.speproject.entity;

import javax.persistence.*;

@Entity
@Table(name="FastingSchedule")
public class FastingSchedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "patientid")
    private int patientid;

    @Column(name = "dateid")
    private int dateid;

    public FastingSchedule(int patientid, int dateid) {
        this.patientid = patientid;
        this.dateid = dateid;
    }

    public FastingSchedule() {

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

    public int getDateid() {
        return dateid;
    }

    public void setDateid(int dateid) {
        this.dateid = dateid;
    }
}
