package com.example.speproject.rest;

import com.example.speproject.JSONEntity.ChefJson;
import com.example.speproject.entity.Chef;
import com.example.speproject.entity.Food;
import com.example.speproject.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class FoodRestController {

    FoodService foodService;

    @Autowired
    public FoodRestController(FoodService foodService) {
        this.foodService = foodService;
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/food")
    public List<Food> findAll(){
        return foodService.findAll();
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping(path = "/food",consumes = "application/JSON")
    public Food addFod(@RequestBody Food food){
        food.setId(0);
        foodService.addFood(food);
        return null;
    }
}
