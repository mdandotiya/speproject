package com.example.speproject.rest;

import com.example.speproject.entity.Admin;
import com.example.speproject.entity.Hospitals;
import com.example.speproject.entity.Patient;
import com.example.speproject.service.HospitalsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class HospitalsRestController {
    private HospitalsService hospitalsService;

    @Autowired
    public HospitalsRestController(HospitalsService theHospitalsService) {
        this.hospitalsService = theHospitalsService;
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/hospitals")
    public List<Hospitals> getHospitals(){
        return hospitalsService.listAllHospitals();
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/hospitals/{hospitalId}")
    public Hospitals getHospitalsById(@PathVariable int hospitalId){
        Hospitals theHospital;

        theHospital=hospitalsService.findById(hospitalId);

        if(theHospital==null){
            throw new RuntimeException("hospital doesnot exist ");
        }
        return theHospital;
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping(path = "/hospitals",consumes = "application/JSON")
    public Hospitals addHospital(@RequestBody Hospitals hospitals){
        hospitals.setId(0);
        hospitalsService.save(hospitals);
        return hospitals;
    }

}
