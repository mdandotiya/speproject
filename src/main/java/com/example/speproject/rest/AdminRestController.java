package com.example.speproject.rest;

import com.example.speproject.entity.Admin;
import com.example.speproject.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class AdminRestController {
    private AdminService adminService;

    @Autowired
    public AdminRestController(AdminService adminService1) {
        this.adminService = adminService1;
    }

//    @CrossOrigin(origins = "http://localhost:3000")
//    @CrossOrigin(origins = "*")
    @GetMapping("/admin")
    public Admin getAdmin(){
        return adminService.findByusername();
    }
}
