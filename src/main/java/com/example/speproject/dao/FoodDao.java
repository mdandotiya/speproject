package com.example.speproject.dao;

import com.example.speproject.entity.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodDao extends JpaRepository<Food,Integer> {
}
