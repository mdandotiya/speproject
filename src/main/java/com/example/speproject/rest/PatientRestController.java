package com.example.speproject.rest;

import com.example.speproject.entity.Patient;
import com.example.speproject.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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


    @CrossOrigin(origins = "http://localhost:3000")
    @DeleteMapping(value = "/patientdel/{id}")
    public ResponseEntity<Integer> deletePost(@PathVariable int id) {

        boolean isRemoved = patientService.deletePatient(id);

        if (!isRemoved) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(id, HttpStatus.OK);
    }
}

