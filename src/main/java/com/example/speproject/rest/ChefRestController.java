package com.example.speproject.rest;

import com.example.speproject.entity.Chef;
import com.example.speproject.service.ChefService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
