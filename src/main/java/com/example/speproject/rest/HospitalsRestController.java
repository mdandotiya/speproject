package com.example.speproject.rest;

import com.example.speproject.entity.Admin;
import com.example.speproject.entity.Hospitals;
import com.example.speproject.entity.Patient;
import com.example.speproject.service.HospitalsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class HospitalsRestController {
    private static Logger logger = LoggerFactory.getLogger(HospitalsRestController.class);
    private HospitalsService hospitalsService;

    @Autowired
    public HospitalsRestController(HospitalsService theHospitalsService) {
        this.hospitalsService = theHospitalsService;
    }


    //    @CrossOrigin(origins = "http://localhost:3000")
    @CrossOrigin(origins = "*")
    @GetMapping("/hospitals")
    public List<Hospitals> getHospitals(){
        logger.info("[Number of Hospitals] - "+hospitalsService.listAllHospitals().size());
        return hospitalsService.listAllHospitals();
    }


    //    @CrossOrigin(origins = "http://localhost:3000")
    @CrossOrigin(origins = "*")
    @GetMapping("/hospitals/{hospitalId}")
    public Hospitals getHospitalsById(@PathVariable int hospitalId){
        Hospitals theHospital;

        theHospital=hospitalsService.findById(hospitalId);

        if(theHospital==null){
            throw new RuntimeException("hospital doesnot exist ");
        }
        return theHospital;
    }


    //    @CrossOrigin(origins = "http://localhost:3000")
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/hospitals",consumes = "application/JSON")
    public Hospitals addHospital(@RequestBody Hospitals hospitals){
        hospitals.setId(0);
        logger.info("[Hospital Name] - "+hospitals.getName()+"[Fee per Visit] - "+hospitals.getFeePerVisit());
        hospitalsService.save(hospitals);
        return hospitals;
    }

}
