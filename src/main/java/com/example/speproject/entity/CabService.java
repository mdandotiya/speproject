package com.example.speproject.entity;

import javax.persistence.*;

@Entity
@Table(name = "Cabservice")
public class CabService {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "noOfCabs")
    private int noOfCabs;

    @Column(name = "totaldistance")
    private int totalKm;

    @Column(name = "dateid")
    private int dateId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNoOfCabs() {
        return noOfCabs;
    }

    public void setNoOfCabs(int noOfCabs) {
        this.noOfCabs = noOfCabs;
    }

    public int getTotalKm() {
        return totalKm;
    }

    public void setTotalKm(int totalKm) {
        this.totalKm = totalKm;
    }
}
