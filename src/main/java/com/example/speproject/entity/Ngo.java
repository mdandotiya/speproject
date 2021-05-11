package com.example.speproject.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Ngo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;

    @Column
    private String name;

    @Column
    private Double raisedFunds;

    @OneToMany(fetch = FetchType.EAGER)
    private List<FundData> fundData;

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

    public List<FundData> getFundData() {
        return fundData;
    }

    public void setFundData(List<FundData> fundData) {
        this.fundData = fundData;
    }
}
