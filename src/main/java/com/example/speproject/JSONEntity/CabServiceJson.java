package com.example.speproject.JSONEntity;

import com.example.speproject.entity.Date;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.List;

public class CabServiceJson {

    private int id;
    private String name;
    private int noOfCabs;
    private int totalAmount;
    private List<String> dates;

    public CabServiceJson() {
    }

    public CabServiceJson(String name, int noOfCabs, int totalAmount, List<String> dates) {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoOfCabs() {
        return noOfCabs;
    }

    public void setNoOfCabs(int noOfCabs) {
        this.noOfCabs = noOfCabs;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public List<String> getDates() {
        return dates;
    }

    public void setDates(List<String> dates) {
        this.dates = dates;
    }
}
