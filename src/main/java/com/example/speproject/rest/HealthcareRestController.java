package com.example.speproject.rest;

import com.example.speproject.JSONEntity.HealthcareJson;
import com.example.speproject.entity.Healthcare;
import com.example.speproject.service.HealthcareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class HealthcareRestController {

    HealthcareService healthcareService;

    @Autowired
    public HealthcareRestController(HealthcareService healthcareService) {
        this.healthcareService = healthcareService;
    }


    //    @CrossOrigin(origins = "http://localhost:3000")
    @CrossOrigin(origins = "*")
    @PostMapping("/healthcare")
    public List<Healthcare> save(@RequestBody HealthcareJson healthcareJson){
        healthcareService.addHealth(healthcareJson);
        return null;
    }
}
