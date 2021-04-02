package com.example.speproject.rest;

import com.example.speproject.entity.Admin;
import com.example.speproject.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AdminRestController {


    private AdminService adminService;

    @Autowired
    public AdminRestController(AdminService adminService1) {
        this.adminService = adminService1;
    }

    @GetMapping("/admin")
    public Admin getAdmin(){
        return adminService.findByusername();
    }
}
