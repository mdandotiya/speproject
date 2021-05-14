package com.example.speproject.rest;

import com.example.speproject.JSONEntity.AssignResourceJson;
import com.example.speproject.entity.HealthEquipment;
import com.example.speproject.entity.Luxuryresource;
import com.example.speproject.service.LuxuryResourceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class LuxuryResourceRestController {
    private static Logger logger = LoggerFactory.getLogger(LuxuryResourceRestController.class);
    LuxuryResourceService luxuryResourceService;

    @Autowired
    public LuxuryResourceRestController(LuxuryResourceService luxuryResourceService) {
        this.luxuryResourceService = luxuryResourceService;
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/luxuryResources")
    public List<Luxuryresource> getAll(){
        logger.info("[Number of Luxury Resources] - "+luxuryResourceService.findAll().size());
        return luxuryResourceService.findAll();
    }


    //    @CrossOrigin(origins = "http://localhost:3000")
    @CrossOrigin(origins = "*")
    @PostMapping(path="/resource",consumes = "application/JSON")
    public Optional<Luxuryresource> addEquipment(@RequestBody Luxuryresource luxuryresource){
        luxuryresource.setId(0);
        return luxuryResourceService.addResource(luxuryresource);
    }


    //    @CrossOrigin(origins = "http://localhost:3000")
    @CrossOrigin(origins = "*")
    @PostMapping(path="/resourceassign",consumes = "application/JSON")
    public Optional<Luxuryresource> assignEquipment(@RequestBody AssignResourceJson assignResourceJson){
        return luxuryResourceService.assignResource(assignResourceJson);
    }
}
