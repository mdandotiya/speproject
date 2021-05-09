package com.example.speproject.JSONEntity;

import com.example.speproject.entity.Healthcare;

import javax.persistence.Column;

public class PatientJson {

    private int id;
    private String name;
    private String gender;
    private int age;
    private String contact;
    private int attendentid;
    private int roomid;
    private int Hemoglobin;
    private double Bloodpressure;
    private double Sugar;
    private double Cholestrol;
    private double Uricacid;

    public PatientJson() {
    }

    public PatientJson(int id, String name, String gender, int age, String contact, int attendentid, int roomid, int hemoglobin, double bloodpressure, double sugar, double cholestrol, double uricacid) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.contact = contact;
        this.attendentid = attendentid;
        this.roomid = roomid;
        this.Hemoglobin = hemoglobin;
        this.Bloodpressure = bloodpressure;
        this.Sugar = sugar;
        this.Cholestrol = cholestrol;
        this.Uricacid = uricacid;
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

    public int getAttendentid() {
        return attendentid;
    }

    public void setAttendentid(int attendentid) {
        this.attendentid = attendentid;
    }

    public int getRoomid() {
        return roomid;
    }

    public void setRoomid(int roomid) {
        this.roomid = roomid;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public double getHemoglobin() {
        return Hemoglobin;
    }

    public void setHemoglobin(int hemoglobin) {
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
