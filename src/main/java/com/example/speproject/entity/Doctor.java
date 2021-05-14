package com.example.speproject.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;

    @Column
    private String name;

    @Column
    private String Specialization;

    @ManyToOne
    private Hospitals hospitals;

    @OneToMany(fetch = FetchType.EAGER)
    private List<Date> dateList;


    public Doctor() {
    }

    public Doctor(String name, String specialization, Hospitals hospitals, List<Date> dates) {
        this.name = name;
        Specialization = specialization;
        this.hospitals = hospitals;
        this.dateList = dates;
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

    public String getSpecialization() {
        return Specialization;
    }

    public void setSpecialization(String specialization) {
        Specialization = specialization;
    }

    public Hospitals getHospitals() {
        return hospitals;
    }

    public void setHospitals(Hospitals hospitals) {
        this.hospitals = hospitals;
    }

    public List<Date> getDates() {
        return dateList;
    }

    public void setDates(List<Date> dates) {
        this.dateList = dates;
    }
}