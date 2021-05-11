package com.example.speproject.JSONEntity;

public class ChefJson {

    private int id;
    private String name;
    private int foodid;

    public ChefJson(int id, String name, int foodid) {
        this.id = id;
        this.name = name;
        this.foodid = foodid;
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

    public int getFoodid() {
        return foodid;
    }

    public void setFoodid(int foodid) {
        this.foodid = foodid;
    }
}
