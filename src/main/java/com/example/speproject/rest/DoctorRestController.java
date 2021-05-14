package com.example.speproject.rest;


import com.example.speproject.entity.Doctor;
import com.example.speproject.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DoctorRestController {

    DoctorService doctorService;

    @Autowired
    public DoctorRestController(DoctorService doctorService) {
        this.doctorService = doctorService;
    }


    //    @CrossOrigin(origins = "http://localhost:3000")
    @CrossOrigin(origins = "*")
    @GetMapping("/doctor")
    public List<Doctor> findAll(){
        return doctorService.findAll();
    }
}
