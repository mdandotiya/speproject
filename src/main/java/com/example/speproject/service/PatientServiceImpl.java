package com.example.speproject.service;

import com.example.speproject.JSONEntity.PatientJson;
import com.example.speproject.dao.AttendentDao;
import com.example.speproject.dao.HealthcareDao;
import com.example.speproject.dao.PatientDao;
import com.example.speproject.dao.RoomDao;
import com.example.speproject.entity.Attendent;
import com.example.speproject.entity.Healthcare;
import com.example.speproject.entity.Patient;
import com.example.speproject.entity.Room;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PatientServiceImpl implements PatientService{

    private PatientDao patientDao;
    private AttendentDao attendentDao;
    private RoomDao roomDao;
    private HealthcareDao healthcareDao;

    @Autowired
    public PatientServiceImpl(PatientDao patientDao, AttendentDao attendentDao, RoomDao roomDao, HealthcareDao healthcareDao) {
        this.patientDao = patientDao;
        this.attendentDao = attendentDao;
        this.roomDao = roomDao;
        this.healthcareDao = healthcareDao;
    }


    @Override
    public List<Patient> findAll() {
        return patientDao.findAll();
    }

    @Override
    public Optional<Patient> getPatient(int id){
        return patientDao.findById(id);
    }

    @Override
    public void deletePatient(int id) {
       patientDao.deleteById(id);
    }

    @Override
    public Patient save(Patient patient) {
        patientDao.save(patient);
        return null;
    }

    @Override
    public List<Patient> getPatientByAttendent(int id) {
        List<Patient> patientList = patientDao.findAll();
        List<Patient> patientList1 = new ArrayList<>();
        for(int i=0;i<patientList.size();i++){
            if(patientList.get(i).getAttendent().getId() == id){
                patientList1.add(patientList.get(i));
            }
        }
        return patientList1;
    }

    @Override
    public Patient getPatientByRoom(int id) {
        List<Patient> patientList = patientDao.findAll();
        Patient patient = new Patient();
        for(int i=0;i<patientList.size();i++){
            if(patientList.get(i).getRoom().getId() == id){
                patient = patientList.get(i);
            }
        }
        return patient;

    }

    @Override
    public Patient updatePatient(Patient patient) {
        patientDao.save(patient);
        return null;
    }
}
