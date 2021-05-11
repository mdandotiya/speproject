package com.example.speproject.service;

import com.example.speproject.dao.DoctorDao;
import com.example.speproject.entity.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorServiceImpl implements DoctorService{

    DoctorDao doctorDao;

    @Autowired
    public DoctorServiceImpl(DoctorDao doctorDao) {
        this.doctorDao = doctorDao;
    }


    @Override
    public List<Doctor> findAll() {
        return doctorDao.findAll();
    }
}
