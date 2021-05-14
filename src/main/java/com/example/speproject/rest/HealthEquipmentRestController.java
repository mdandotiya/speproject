package com.example.speproject.rest;

import com.example.speproject.JSONEntity.AssignEquipmentJson;
import com.example.speproject.entity.HealthEquipment;
import com.example.speproject.entity.Room;
import com.example.speproject.service.HealthEquipmentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class HealthEquipmentRestController {
    private static Logger logger = LoggerFactory.getLogger(HealthEquipmentRestController.class);
    HealthEquipmentService healthEquipmentService;

    public HealthEquipmentRestController(HealthEquipmentService healthEquipmentService) {
        this.healthEquipmentService = healthEquipmentService;
    }


    //    @CrossOrigin(origins = "http://localhost:3000")
 //   @CrossOrigin(origins = "*")
    @GetMapping("/healthEquipment")
    public List<HealthEquipment> getAll(){
        logger.info("[Number of Health Equipments] - "+healthEquipmentService.findAll().size());
        return healthEquipmentService.findAll();
    }


    //    @CrossOrigin(origins = "http://localhost:3000")
  //  @CrossOrigin(origins = "*")
    @PostMapping(path="/equipment",consumes = "application/JSON")
    public Optional<HealthEquipment> addEquipment(@RequestBody HealthEquipment healthEquipment){
        healthEquipment.setId(0);
        return healthEquipmentService.addEquipment(healthEquipment);
    }


    //    @CrossOrigin(origins = "http://localhost:3000")
  //  @CrossOrigin(origins = "*")
    @PostMapping(path="/equipmentassign",consumes = "application/JSON")
    public Optional<HealthEquipment> addEquipment(@RequestBody AssignEquipmentJson assignEquipmentJson){
        return healthEquipmentService.assignEquipment(assignEquipmentJson);
    }


}
