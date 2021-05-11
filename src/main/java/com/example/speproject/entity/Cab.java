package com.example.speproject.entity;

import javax.persistence.*;

@Entity
@Table
public class Cab {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;

    @Column
    private String name;

    @Column
    private Double farePerKm;

    @Column
    private int totalKm;

    @ManyToOne
    private CabService cabService;

    public Cab() {
    }

    public Cab(String name, Double farePerKm, int totalKm, CabService cabService) {
        this.name = name;
        this.farePerKm = farePerKm;
        this.totalKm = totalKm;
        this.cabService = cabService;
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

    public Double getFarePerKm() {
        return farePerKm;
    }

    public void setFarePerKm(Double farePerKm) {
        this.farePerKm = farePerKm;
    }

    public CabService getCabService() {
        return cabService;
    }

    public void setCabService(CabService cabService) {
        this.cabService = cabService;
    }

    public int getTotalKm() {
        return totalKm;
    }

    public void setTotalKm(int totalKm) {
        this.totalKm = totalKm;
    }
}
