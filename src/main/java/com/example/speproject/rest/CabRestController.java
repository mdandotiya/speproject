package com.example.speproject.rest;

import com.example.speproject.entity.Cab;
import com.example.speproject.service.CabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CabRestController {

    CabService cabService;

    @Autowired
    public CabRestController(CabService cabService) {
        this.cabService = cabService;
    }


    //    @CrossOrigin(origins = "http://localhost:3000")
    @CrossOrigin(origins = "*")
    @GetMapping("/cab")
    public List<Cab> findAll(){
        return cabService.findAll();
    }
}
