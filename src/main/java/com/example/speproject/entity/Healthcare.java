package com.example.speproject.entity;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table
public class Healthcare implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private double Hemoglobin;

    @Column
    private double Bloodpressure;

    @Column
    private double Sugar;

    @Column
    private double Cholestrol;

    @Column
    private double Uricacid;


    public Healthcare(double hemoglobin, double bloodpressure, double sugar, double cholestrol, double uricacid) {
        Hemoglobin = hemoglobin;
        Bloodpressure = bloodpressure;
        Sugar = sugar;
        Cholestrol = cholestrol;
        Uricacid = uricacid;
    }

    public Healthcare() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getHemoglobin() {
        return Hemoglobin;
    }

    public void setHemoglobin(double hemoglobin) {
        Hemoglobin = hemoglobin;
    }

    public double getBloodpressure() {
        return Bloodpressure;
    }

    public void setBloodpressure(double bloodpressure) {
        Bloodpressure = bloodpressure;
    }

    public double getSugar() {
        return Sugar;
    }

    public void setSugar(double sugar) {
        Sugar = sugar;
    }

    public double getCholestrol() {
        return Cholestrol;
    }

    public void setCholestrol(double cholestrol) {
        Cholestrol = cholestrol;
    }

    public double getUricacid() {
        return Uricacid;
    }

    public void setUricacid(double uricacid) {
        Uricacid = uricacid;
    }
}
