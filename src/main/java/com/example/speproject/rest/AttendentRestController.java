package com.example.speproject.rest;

import com.example.speproject.JSONEntity.PatientJson;
import com.example.speproject.entity.Attendent;
import com.example.speproject.service.AttendentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AttendentRestController {

    AttendentService attendentService;

    @Autowired
    public AttendentRestController(AttendentService attendentService) {
        this.attendentService = attendentService;
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/attendent")
    public List<Attendent> getAll(){
        return attendentService.findAll();
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping(path = "/attendent",consumes = "application/JSON")
    public Attendent addAttendent(@RequestBody  Attendent attendent){
        attendent.setId(0);
        attendentService.saveAttendent(attendent);
        return attendent;
    }
}
