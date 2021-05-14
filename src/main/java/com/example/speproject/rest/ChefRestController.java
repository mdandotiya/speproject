package com.example.speproject.rest;

import com.example.speproject.JSONEntity.ChefJson;
import com.example.speproject.JSONEntity.PatientJson;
import com.example.speproject.entity.Chef;
import com.example.speproject.service.ChefService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ChefRestController {
    private static Logger logger = LoggerFactory.getLogger(ChefRestController.class);

    ChefService chefService;

    @Autowired
    public ChefRestController(ChefService chefService) {
        this.chefService = chefService;
    }


    //    @CrossOrigin(origins = "http://localhost:3000")
    @CrossOrigin(origins = "*")
    @GetMapping("/chef")
    public List<Chef> getAll(){
        logger.info("[Number of Chefs] - "+chefService.findAll().size());
        return chefService.findAll();
    }


    //    @CrossOrigin(origins = "http://localhost:3000")
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/chef",consumes = "application/JSON")
    public Chef addChef(@RequestBody ChefJson chef){
        chef.setId(0);
        chefService.save(chef);
        return null;
    }
}
