package com.example.speproject.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;

@Entity
@Table(name="patient")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "gender")
    private String gender;

    @Column(name = "age")
    private int age;

    @Column(name = "contactno")
    private double contactno;

    @OneToOne
    @JoinColumn(name="id", nullable=false, insertable = false,updatable = false)
    @JsonUnwrapped
    private Healthcare healthcare;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="attendentid", nullable=false,insertable = false,updatable = false)
    private Attendent attendent;

    public Patient(){}

    public Patient(String name, String gender, int age, double contactno) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.contactno = contactno;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getContactno() {
        return contactno;
    }

    public void setContactno(double contactno) {
        this.contactno = contactno;
    }
}
