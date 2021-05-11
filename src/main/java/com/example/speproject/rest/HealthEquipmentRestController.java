package com.example.speproject.rest;

import com.example.speproject.JSONEntity.AssignEquipmentJson;
import com.example.speproject.entity.HealthEquipment;
import com.example.speproject.entity.Room;
import com.example.speproject.service.HealthEquipmentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class HealthEquipmentRestController {

    HealthEquipmentService healthEquipmentService;

    public HealthEquipmentRestController(HealthEquipmentService healthEquipmentService) {
        this.healthEquipmentService = healthEquipmentService;
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/healthEquipment")
    public List<HealthEquipment> getAll(){
        return healthEquipmentService.findAll();
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping(path="/equipment",consumes = "application/JSON")
    public Optional<HealthEquipment> addEquipment(@RequestBody HealthEquipment healthEquipment){
        healthEquipment.setId(0);
        return healthEquipmentService.addEquipment(healthEquipment);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping(path="/equipmentassign",consumes = "application/JSON")
    public Optional<HealthEquipment> addEquipment(@RequestBody AssignEquipmentJson assignEquipmentJson){
        return healthEquipmentService.assignEquipment(assignEquipmentJson);
    }


}
