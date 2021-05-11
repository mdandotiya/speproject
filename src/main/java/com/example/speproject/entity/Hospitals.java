package com.example.speproject.entity;

import javax.persistence.*;

@Entity
@Table
public class Hospitals {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;

    @Column
    private String name;

    @Column
    private int feePerVisit;

    public Hospitals(int id, String name, int feePerVisit) {
        this.id = id;
        this.name = name;
        this.feePerVisit = feePerVisit;
    }

    public Hospitals() {

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

    public int getFeePerVisit() {
        return feePerVisit;
    }

    public void setFeePerVisit(int feePerVisit) {
        this.feePerVisit = feePerVisit;
    }
}
