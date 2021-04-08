package com.example.speproject.service;

import com.example.speproject.dao.PatientDao;
import com.example.speproject.entity.Patient;
import org.springframework.stereotype.Service;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class PatientServiceImpl implements PatientService{

    private PatientDao patientDao;

    @Autowired
    public PatientServiceImpl(PatientDao patientDao) {
        this.patientDao = patientDao;
    }


    @Override
    public List<Patient> findAll() {
        return patientDao.findAll();
    }
}
