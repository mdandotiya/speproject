package com.example.speproject.rest;

import com.example.speproject.JSONEntity.ChefJson;
import com.example.speproject.entity.Chef;
import com.example.speproject.entity.CleaningStaff;
import com.example.speproject.service.CleaningStaffService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class CleaningStaffRestController {

    private static Logger logger = LoggerFactory.getLogger(CleaningStaffRestController.class);


    CleaningStaffService cleaningStaffService;

    @Autowired
    public CleaningStaffRestController(CleaningStaffService cleaningStaffService) {
        this.cleaningStaffService = cleaningStaffService;
    }


    //    @CrossOrigin(origins = "http://localhost:3000")
    @CrossOrigin(origins = "*")
    @GetMapping("/cleaningStaff")
    public List<CleaningStaff> findAll(){
        logger.info("[Number of Cleaning Staff] - "+cleaningStaffService.findAll().size());
        return cleaningStaffService.findAll();
    }


    //    @CrossOrigin(origins = "http://localhost:3000")
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/cleaner",consumes = "application/JSON")
    public CleaningStaff addCleaner(@RequestBody CleaningStaff cleaningStaff){
        cleaningStaff.setId(0);
        if(cleaningStaff.getWeekday().equals("MWF")) {
            logger.info("[MWF Cleaning Staff] - " + cleaningStaff.getName());
        }
        else{
            logger.info("[TTS Cleaning Staff] - "+cleaningStaff.getName());
        }
        cleaningStaffService.save(cleaningStaff);
        return null;
    }
}
