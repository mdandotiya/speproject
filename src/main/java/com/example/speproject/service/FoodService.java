package com.example.speproject.service;

import com.example.speproject.entity.Food;

import java.util.List;
import java.util.Optional;

public interface FoodService {
    public List<Food> findAll();
    public Optional<Food> findById(int id);
    public List<Food> addFood(Food food);
}
