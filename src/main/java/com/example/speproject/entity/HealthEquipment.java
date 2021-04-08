package com.example.speproject.entity;

import javax.persistence.*;

@Entity
@Table(name="HealthEquipment")
public class HealthEquipment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "availability")
    private int availability;

    public HealthEquipment(String name, int availability) {
        this.name = name;
        this.availability = availability;
    }

    public HealthEquipment() {

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

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }
}
