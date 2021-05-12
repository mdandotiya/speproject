package com.example.speproject.JSONEntity;

import com.example.speproject.entity.Attendent;
import com.example.speproject.entity.Healthcare;
import com.example.speproject.entity.Room;

import javax.persistence.Column;

public class PatientJson {

    private int id;
    private String name;
    private String gender;
    private int age;
    private String contact;
    private Attendent attendent;
    private Room room;
    private HealthcareJson healthcareJson;

    public PatientJson(String name, String gender, int age, String contact, Attendent attendent, Room room, HealthcareJson healthcareJson) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.contact = contact;
        this.attendent = attendent;
        this.room = room;
        this.healthcareJson = healthcareJson;
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

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
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

    public HealthcareJson getHealthcareJson() {
        return healthcareJson;
    }

    public void setHealthcareJson(HealthcareJson healthcareJson) {
        this.healthcareJson = healthcareJson;
    }
}


