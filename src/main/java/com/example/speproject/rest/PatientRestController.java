package com.example.speproject.rest;

import com.example.speproject.entity.Patient;
import com.example.speproject.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PatientRestController {

    private PatientService patientService;

    @Autowired
    public PatientRestController(PatientService patientService) {
        this.patientService = patientService;
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/patient")
    public List<Patient> getAll(){
        return patientService.findAll();
    }
}
