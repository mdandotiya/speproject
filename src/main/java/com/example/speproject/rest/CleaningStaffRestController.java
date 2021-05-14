package com.example.speproject.rest;

import com.example.speproject.JSONEntity.ChefJson;
import com.example.speproject.entity.Chef;
import com.example.speproject.entity.CleaningStaff;
import com.example.speproject.service.CleaningStaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CleaningStaffRestController {

    CleaningStaffService cleaningStaffService;

    @Autowired
    public CleaningStaffRestController(CleaningStaffService cleaningStaffService) {
        this.cleaningStaffService = cleaningStaffService;
    }


    //    @CrossOrigin(origins = "http://localhost:3000")
    @CrossOrigin(origins = "*")
    @GetMapping("/cleaningStaff")
    public List<CleaningStaff> findAll(){
        return cleaningStaffService.findAll();
    }


    //    @CrossOrigin(origins = "http://localhost:3000")
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/cleaner",consumes = "application/JSON")
    public CleaningStaff addCleaner(@RequestBody CleaningStaff cleaningStaff){
        cleaningStaff.setId(0);
        cleaningStaffService.save(cleaningStaff);
        return null;
    }
}
