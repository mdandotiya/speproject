package com.example.speproject.rest;

import com.example.speproject.entity.Cab;
import com.example.speproject.service.CabService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class CabRestController {

    private static Logger logger = LoggerFactory.getLogger(CabRestController.class);

    CabService cabService;


    @Autowired
    public CabRestController(CabService cabService) {
        this.cabService = cabService;
    }


    //    @CrossOrigin(origins = "http://localhost:3000")
//    @CrossOrigin(origins = "*")
    @GetMapping("/cab")
    public List<Cab> findAll(){
        logger.info("[Number of Cabs] - "+cabService.findAll().size());
        return cabService.findAll();
    }
}
