package com.example.speproject.rest;

import com.example.speproject.JSONEntity.HealthcareJson;
import com.example.speproject.entity.Healthcare;
import com.example.speproject.service.HealthcareService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class HealthcareRestController {

    private static Logger logger = LoggerFactory.getLogger(HealthcareRestController.class);

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
