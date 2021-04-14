package com.example.speproject.service;

import com.example.speproject.entity.Hospitals;

import java.util.List;

public interface HospitalsService {
    List<Hospitals> listAllHospitals();
    Hospitals findById(int theId);
    void save(Hospitals theHospital);
    void deleteById(int theId);
}
