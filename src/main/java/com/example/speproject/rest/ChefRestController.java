package com.example.speproject.rest;

import com.example.speproject.JSONEntity.ChefJson;
import com.example.speproject.JSONEntity.PatientJson;
import com.example.speproject.entity.Chef;
import com.example.speproject.service.ChefService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ChefRestController {

    ChefService chefService;

    @Autowired
    public ChefRestController(ChefService chefService) {
        this.chefService = chefService;
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/chef")
    public List<Chef> getAll(){
        return chefService.findAll();
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping(path = "/chef",consumes = "application/JSON")
    public Chef addChef(@RequestBody ChefJson chef){
        chef.setId(0);
        chefService.save(chef);
        return null;
    }
}
