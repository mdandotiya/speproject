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

    @Column
    private int doctor_id;

    @ManyToOne
    private Attendent attendent;

    @OneToOne
    private Room room;

    @OneToOne
    private Healthcare healthcare;


    @ManyToMany(fetch = FetchType.EAGER)
    private List<Date> dates;



    public Patient(){}

    public Patient(String name, String gender, int age, String contact, Attendent attendent, Room room, Healthcare healthcare, List<Date> dates, int doctor_id) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.contact = contact;
        this.attendent = attendent;
        this.room = room;
        this.healthcare = healthcare;
        this.dates = dates;
        this.doctor_id=doctor_id;
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

    public List<Date> getDates() {
        return dates;
    }

    public void setDates(List<Date> dates) {
        this.dates = dates;
    }

    public int getDoctor_id() {
        return doctor_id;
    }

    public void setDoctor_id(int doctor_id) {
        this.doctor_id = doctor_id;
    }
}
