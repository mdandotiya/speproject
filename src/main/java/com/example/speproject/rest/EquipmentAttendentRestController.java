package com.example.speproject.rest;

import com.example.speproject.entity.EquipmentAttendent;
import com.example.speproject.service.EquipmentAttendentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class EquipmentAttendentRestController {

    EquipmentAttendentService equipmentAttendentService;

    @Autowired
    public EquipmentAttendentRestController(EquipmentAttendentService equipmentAttendentService) {
        this.equipmentAttendentService = equipmentAttendentService;
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/equipmentAttendent")
    public Optional<EquipmentAttendent> save(@RequestBody EquipmentAttendent equipmentAttendent){
        equipmentAttendentService.save(equipmentAttendent);
        return null;
    }
}
