package com.example.speproject.entity;

import javax.persistence.*;

@Entity
@Table(name = "Hospitals")
public class Hospitals {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "feepervisit")
    private int feePerVisit;

    public Hospitals(int id, String name, int feePerVisit) {
        this.id = id;
        this.name = name;
        this.feePerVisit = feePerVisit;
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
