package com.example.speproject.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String type;

    @OneToMany(fetch = FetchType.EAGER)
    private List<Chef> chefList;

    public Food(String type) {
        this.type = type;
    }

    public Food() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Chef> getChefList() {
        return chefList;
    }

    public void setChefList(List<Chef> chefList) {
        this.chefList = chefList;
    }
}
