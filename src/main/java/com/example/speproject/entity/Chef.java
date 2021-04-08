package com.example.speproject.entity;

import javax.persistence.*;

@Entity
@Table(name="Chef")
public class Chef {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "typeid")
    private int typeid;

    public Chef(String name, int typeid) {
        this.name = name;
        this.typeid = typeid;
    }

    public Chef() {

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

    public int getTypeid() {
        return typeid;
    }

    public void setTypeid(int typeid) {
        this.typeid = typeid;
    }
}
