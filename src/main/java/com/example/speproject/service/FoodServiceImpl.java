package com.example.speproject.service;

import com.example.speproject.dao.FoodDao;
import com.example.speproject.entity.Food;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FoodServiceImpl implements FoodService{

    FoodDao foodDao;

    @Autowired
    public FoodServiceImpl(FoodDao foodDao) {
        this.foodDao = foodDao;
    }


    @Override
    public List<Food> findAll() {
        return foodDao.findAll();
    }

    @Override
    public Optional<Food> findById(int id) {
        return foodDao.findById(id);
    }

    @Override
    public List<Food> addFood(Food food) {
        foodDao.save(food);
        return null;
    }


}
