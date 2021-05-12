package com.example.speproject.service;

import com.example.speproject.JSONEntity.DateJson;
import com.example.speproject.JSONEntity.PatientJson;
import com.example.speproject.entity.Date;
import com.example.speproject.entity.Patient;

import java.util.List;
import java.util.Optional;

public interface PatientService {

    public List<Patient> findAll();
    public Optional<Patient> getPatient(int id);
    public void deletePatient(int id);
    public Patient save(PatientJson patientJson);
    public List<Patient> getPatientByAttendent(int id);
    public Patient getPatientByRoom(int id);
    public Patient updatePatient(Patient patient);
    public Date saveDate(List<String> date);
}
