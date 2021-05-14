package com.example.speproject.rest;

import com.example.speproject.JSONEntity.CabServiceJson;
import com.example.speproject.entity.CabService;
import com.example.speproject.entity.Hospitals;
import com.example.speproject.entity.Patient;
import com.example.speproject.service.CabServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CabServiceRestController {

    CabServiceService cabServiceService;

    @Autowired
    public CabServiceRestController(CabServiceService cabServiceService) {
        this.cabServiceService = cabServiceService;
    }


    //    @CrossOrigin(origins = "http://localhost:3000")
    @CrossOrigin(origins = "*")
    @GetMapping("/cabService")
    public List<CabService> getCabServices(){
        return cabServiceService.listAllCabServices();
    }


    //    @CrossOrigin(origins = "http://localhost:3000")
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/cabService",consumes = "application/JSON")
    public CabService addService(@RequestBody CabServiceJson cabServiceJson){
        cabServiceJson.setId(0);
        cabServiceService.save(cabServiceJson);
        return null;
    }


}
