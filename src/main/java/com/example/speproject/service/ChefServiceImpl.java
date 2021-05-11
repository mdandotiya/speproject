package com.example.speproject.service;

import com.example.speproject.JSONEntity.ChefJson;
import com.example.speproject.dao.ChefDao;
import com.example.speproject.dao.FoodDao;
import com.example.speproject.entity.Chef;
import com.example.speproject.entity.Food;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ChefServiceImpl implements ChefService{

    private ChefDao chefDao;
    private FoodDao foodDao;

    @Autowired
    public ChefServiceImpl(ChefDao chefDao,FoodDao foodDao) {
        this.chefDao = chefDao;
        this.foodDao = foodDao;
    }

    @Override
    public List<Chef> findAll() {
        return chefDao.findAll();
    }

    @Override
    public Optional<Chef> save(ChefJson chef) {
        Chef chef1 = new Chef();
        Food food = foodDao.findById(chef.getFoodid()).get();
        chef1.setFood(food);
        chef1.setId(chef.getId());
        chef1.setName(chef.getName());
        chefDao.save(chef1);
        return Optional.empty();
    }
}
