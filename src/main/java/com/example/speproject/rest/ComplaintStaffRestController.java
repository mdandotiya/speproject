package com.example.speproject.rest;

import com.example.speproject.entity.ComplaintStaff;
import com.example.speproject.service.ComplaintStaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ComplaintStaffRestController {

    ComplaintStaffService complaintStaffService;

    @Autowired
    public ComplaintStaffRestController(ComplaintStaffService complaintStaffService) {
        this.complaintStaffService = complaintStaffService;
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/complaintStaff")
    public List<ComplaintStaff> findAll(){
        return complaintStaffService.findAll();
    }
}
