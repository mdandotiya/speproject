package com.example.speproject.entity;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table
public class Patient implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;

    @Column
    private String name;

    @Column
    private String gender;

    @Column
    private int age;

    @Column
    private String contact;

    @ManyToOne
    private Attendent attendent;

    @OneToOne
    private Room room;

    @OneToOne
    private Healthcare healthcare;


    @ManyToMany
    private List<Date> dates;

    public Patient(){}

    public Patient(String name, String gender, int age, String contact) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.contact = contact;
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

    public String getContactno() {
        return contact;
    }

    public void setContactno(String contactno) {
        this.contact = contactno;
    }

    public Attendent getAttendent() {
        return attendent;
    }

    public void setAttendent(Attendent attendent) {
        this.attendent = attendent;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public Healthcare getHealthcare() {
        return healthcare;
    }

    public void setHealthcare(Healthcare healthcare) {
        this.healthcare = healthcare;
    }

}
