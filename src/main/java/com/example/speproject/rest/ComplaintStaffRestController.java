package com.example.speproject.rest;

import com.example.speproject.JSONEntity.ComplaintJson;
import com.example.speproject.JSONEntity.ComplaintStaffJson;
import com.example.speproject.entity.ComplaintStaff;
import com.example.speproject.entity.Complaints;
import com.example.speproject.entity.Patient;
import com.example.speproject.service.ComplaintStaffService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class ComplaintStaffRestController {

    private static Logger logger = LoggerFactory.getLogger(ComplaintStaffRestController.class);


    ComplaintStaffService complaintStaffService;

    @Autowired
    public ComplaintStaffRestController(ComplaintStaffService complaintStaffService) {
        this.complaintStaffService = complaintStaffService;
    }


    //    @CrossOrigin(origins = "http://localhost:3000")
    @CrossOrigin(origins = "*")
    @GetMapping("/complaintStaff")
    public List<ComplaintStaff> findAll(){
        logger.info("[Number of Complaint Staff] - "+complaintStaffService.findAll().size());
        return complaintStaffService.findAll();
    }


    //    @CrossOrigin(origins = "http://localhost:3000")
    @CrossOrigin(origins = "*")
    @GetMapping("/complaint")
    public List<ComplaintJson> findComplaints(){
        List<Complaints> complaints =  complaintStaffService.findComplaints();
        logger.info("[Number of Complaints] - "+complaintStaffService.findComplaints().size());
        List<ComplaintJson> complaintJsons = new ArrayList<>();
        for(int i=0;i<complaints.size();i++){
            complaintJsons.add(new ComplaintJson(complaints.get(i).getId(),complaints.get(i).getDetail()));
        }
        return complaintJsons;
    }


    //    @CrossOrigin(origins = "http://localhost:3000")
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/staff",consumes = "application/JSON")
    public ComplaintStaff addStaff(@RequestBody ComplaintStaffJson complaintStaffJson){
        logger.info("[Complaint Staff Open Complaints] - "+complaintStaffJson.getOpenComplaints());
        complaintStaffService.save(complaintStaffJson);
        return null;
    }
}
