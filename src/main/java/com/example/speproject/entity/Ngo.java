package com.example.speproject.entity;

import javax.persistence.*;

@Entity
@Table(name = "Ngo")
public class Ngo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "raisedfunds")
    private Double raisedFunds;

    @Column(name = "fundid")
    private int fundId;

    public Ngo(int id, String name, Double raisedFunds) {
        this.id = id;
        this.name = name;
        this.raisedFunds = raisedFunds;
    }

    public Ngo() {

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

    public Double getRaisedFunds() {
        return raisedFunds;
    }

    public void setRaisedFunds(Double raisedFunds) {
        this.raisedFunds = raisedFunds;
    }



}
