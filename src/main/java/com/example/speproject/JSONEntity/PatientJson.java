package com.example.speproject.JSONEntity;

import com.example.speproject.entity.Attendent;
import com.example.speproject.entity.Healthcare;
import com.example.speproject.entity.Room;

import javax.persistence.Column;
import java.util.List;

public class PatientJson {

    private int id;
    private String name;
    private String gender;
    private int age;
    private String contact;
    private Attendent attendent;
    private Room room;
    private Healthcare healthcare;
    private List<String> dates;

    public PatientJson() {
    }

    public PatientJson(String name, String gender, int age, String contact, Attendent attendent, Room room, Healthcare healthcare, List<String> dates) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.contact = contact;
        this.attendent = attendent;
        this.room = room;
        this.healthcare = healthcare;
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

    public Healthcare getHealthcare() {
        return healthcare;
    }

    public void setHealthcare(Healthcare healthcare) {
        this.healthcare = healthcare;
    }

    public List<String> getDates() {
        return dates;
    }

    public void setDates(List<String> dates) {
        this.dates = dates;
    }
}


