package com.example.speproject.rest;

import com.example.speproject.JSONEntity.PatientJson;
import com.example.speproject.entity.Attendent;
import com.example.speproject.service.AttendentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class AttendentRestController {

    private static Logger logger = LoggerFactory.getLogger(AttendentRestController.class);

    AttendentService attendentService;

    @Autowired
    public AttendentRestController(AttendentService attendentService) {
        this.attendentService = attendentService;
    }


    //    @CrossOrigin(origins = "http://localhost:3000")
  //  @CrossOrigin(origins = "*")
    @GetMapping("/attendent")
    public List<Attendent> getAll(){
        logger.info("[Number of Attendents] - "+attendentService.findAll().size());
        return attendentService.findAll();
    }

   // @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping(path = "/attendent",consumes = "application/JSON")
    public Attendent addAttendent(@RequestBody  Attendent attendent){
        attendent.setId(0);
        logger.info("[Attendent Gender] - "+attendent.getGender());
        attendentService.saveAttendent(attendent);
        return attendent;
    }
}
