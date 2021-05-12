package com.example.speproject.service;

import com.example.speproject.JSONEntity.AssignResourceJson;
import com.example.speproject.dao.HealthEquipmentDao;
import com.example.speproject.dao.LuxuryResourceDao;
import com.example.speproject.entity.HealthEquipment;
import com.example.speproject.entity.Luxuryresource;
import com.example.speproject.entity.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class LuxuryResourceServiceimpl implements LuxuryResourceService{

    LuxuryResourceDao luxuryResourceDao;

    @Autowired
    public LuxuryResourceServiceimpl(LuxuryResourceDao luxuryResourceDao) {
        this.luxuryResourceDao=luxuryResourceDao;
    }

    @Override
    public List<Luxuryresource> findAll() {
        return luxuryResourceDao.findAll();
    }

    @Override
    public Optional<Luxuryresource> addResource(Luxuryresource luxuryresource) {
        luxuryResourceDao.save(luxuryresource);
        return Optional.empty();
    }

    @Override
    public Optional<Luxuryresource> assignResource(AssignResourceJson assignResourceJson) {
        Luxuryresource luxuryresource = assignResourceJson.getResource();
        Patient patient = assignResourceJson.getPatient();
        List<Patient> patientList = new ArrayList<>();
        patientList.add(patient);
        luxuryresource.setPatients(patientList);
        luxuryResourceDao.save(luxuryresource);
        return Optional.empty();
    }
}
