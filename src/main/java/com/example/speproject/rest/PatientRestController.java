package com.example.speproject.rest;

import com.example.speproject.JSONEntity.PatientJson;
import com.example.speproject.entity.Patient;
import com.example.speproject.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
    public ResponseEntity<HttpStatus> deletePost(@PathVariable int id) {
        try {
            patientService.deletePatient(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        catch(Exception e){
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping(path = "/patient",consumes = "application/JSON")
    public Patient addPatient(@RequestBody Patient patient){
        patient.setId(0);
        patient.getHealthcare().setId(0);
        patientService.save(patient);
        return patient;
    }

    @CrossOrigin(origins="http://localhost:3000")
    @PutMapping("/patient")
    public Patient updatePatient(@RequestBody Patient patient){
        return patientService.updatePatient(patient);

    }


    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/patientById/{id}")
    public Optional<Patient> getPatient(@PathVariable int id){
        return patientService.getPatient(id);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/patientByAttendentId/{id}")
    public List<Patient> getPatientByAttendent(@PathVariable int id){
        return patientService.getPatientByAttendent(id);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/patientByRoomId/{id}")
    public Patient getPatientByRoom(@PathVariable int id){
        return patientService.getPatientByRoom(id);
    }
}

