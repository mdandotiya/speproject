package com.example.speproject.rest;

import com.example.speproject.JSONEntity.AddHealthJson;
import com.example.speproject.JSONEntity.DateJson;
import com.example.speproject.JSONEntity.PatientJson;
import com.example.speproject.entity.Date;
import com.example.speproject.entity.Healthcare;
import com.example.speproject.entity.Patient;
import com.example.speproject.service.PatientService;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class PatientRestController {
    private static Logger logger = LoggerFactory.getLogger(PatientRestController.class);
    private PatientService patientService;

    @Autowired
    public PatientRestController(PatientService patientService) {
        this.patientService = patientService;
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/patient")
    public List<Patient> getAll(){
        logger.info("[Number of Patients] - "+patientService.findAll().size());
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
    public Date addPatient(@RequestBody Patient patient){
        patientService.save(patient);
        return null;
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping(path = "/date",consumes = "application/JSON")
    public Date addDate(@RequestBody PatientJson patientJson){
        logger.info("[Number of Days people are keeping fast] - "+patientJson.getDates().size());
        patientService.saveDate(patientJson);
        return null;
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

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping(path = "/addHealth",consumes = "application/JSON")
    public Healthcare addHealth(@RequestBody String result){
        patientService.saveHealth(result);
        return null;
    }
}

