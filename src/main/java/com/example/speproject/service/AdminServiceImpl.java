package com.example.speproject.service;

import com.example.speproject.dao.AdminDao;
import com.example.speproject.entity.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AdminServiceImpl implements AdminService{

//    @Autowired
    private AdminDao adminDao;

    @Autowired
    public AdminServiceImpl(AdminDao adminDao){
        this.adminDao = adminDao;
    }

    @Override
    @Transactional
    public Admin findByusername() {
        return adminDao.findByusername();
    }
}
