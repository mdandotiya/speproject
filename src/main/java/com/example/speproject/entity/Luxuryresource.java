package com.example.speproject.entity;

import javax.persistence.*;

@Entity
@Table(name="Luxuryresource")
public class Luxuryresource {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "availability")
    private int availability;

    public Luxuryresource(String name, int availability) {
        this.name = name;
        this.availability = availability;
    }

    public Luxuryresource() {

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
