package com.example.speproject.rest;

import com.example.speproject.entity.Ngo;
import com.example.speproject.entity.Patient;
import com.example.speproject.service.NGOService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class NGORestController {

    private NGOService ngoService;

    @Autowired
    public NGORestController(NGOService ngoService) {
        this.ngoService = ngoService;
    }


    //    @CrossOrigin(origins = "http://localhost:3000")
    @CrossOrigin(origins = "*")
    @GetMapping("/ngo")
    public List<Ngo> getAll(){
        return ngoService.findAll();
    }


    @CrossOrigin(origins = "http://localhost:3000")
    @DeleteMapping(value = "/NGOdel/{id}")
    public ResponseEntity<HttpStatus> deletePost(@PathVariable int id) {
        try {
            ngoService.deleteNgo(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        catch(Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping(path = "/ngo",consumes = "application/JSON")
    public Ngo addNgo(@RequestBody Ngo ngo){
        ngo.setId(0);
        ngoService.save(ngo);
        return ngo;
    }
}
