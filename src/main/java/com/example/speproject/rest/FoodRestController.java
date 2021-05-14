package com.example.speproject.rest;

import com.example.speproject.JSONEntity.ChefJson;
import com.example.speproject.entity.Chef;
import com.example.speproject.entity.Food;
import com.example.speproject.service.FoodService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class FoodRestController {

    private static Logger logger = LoggerFactory.getLogger(FoodRestController.class);

    FoodService foodService;

    @Autowired
    public FoodRestController(FoodService foodService) {
        this.foodService = foodService;
    }


    //    @CrossOrigin(origins = "http://localhost:3000")
  //  @CrossOrigin(origins = "*")
    @GetMapping("/food")
    public List<Food> findAll(){
        logger.info("[Number of Types Of Food] - "+foodService.findAll().size());
        return foodService.findAll();
    }


    //    @CrossOrigin(origins = "http://localhost:3000")
 //   @CrossOrigin(origins = "*")
    @PostMapping(path = "/food",consumes = "application/JSON")
    public Food addFod(@RequestBody Food food){
        food.setId(0);
        foodService.addFood(food);
        return null;
    }
}
