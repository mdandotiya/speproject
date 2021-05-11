package com.example.speproject.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class CabService {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;

    @Column
    private String name;

    @Column
    private int noOfCabs;

    @Column
    private int totalAmount;

    @OneToMany(fetch = FetchType.EAGER)
    private List<Date> dates;

    public CabService() {
    }

    public CabService(String name, int noOfCabs, int totalAmount, List<Date> dates) {
        this.name = name;
        this.noOfCabs = noOfCabs;
        this.totalAmount = totalAmount;
        this.dates = dates;
    }

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
        return totalAmount;
    }

    public void setTotalKm(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public List<Date> getDates() {
        return dates;
    }

    public void setDates(List<Date> dates) {
        this.dates = dates;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }
}
