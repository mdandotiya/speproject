package com.example.speproject.entity;

import javax.persistence.*;

@Entity
@Table(name = "Hospitalservice")
public class HospitalService {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "docterid")
    private int docterId;

    @Column(name = "dateid")
    private int dateId;

    public HospitalService() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
