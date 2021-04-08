package com.example.speproject.dao;

import com.example.speproject.entity.Patient;

import java.util.List;

public interface PatientDao {
    public List<Patient> findAll();
}
