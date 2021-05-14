package com.example.speproject.service;

import com.example.speproject.JSONEntity.AddHealthJson;
import com.example.speproject.JSONEntity.DateJson;
import com.example.speproject.JSONEntity.PatientJson;
import com.example.speproject.dao.*;
import com.example.speproject.entity.*;
import com.example.speproject.rest.PatientRestController;
import org.json.JSONArray;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PatientServiceImpl implements PatientService{

    private static Logger logger = LoggerFactory.getLogger(PatientServiceImpl.class);

    private PatientDao patientDao;
    private AttendentDao attendentDao;
    private RoomDao roomDao;
    private HealthcareDao healthcareDao;
    private DateDao dateDao;

    @Autowired
    public PatientServiceImpl(PatientDao patientDao, AttendentDao attendentDao, RoomDao roomDao, HealthcareDao healthcareDao,DateDao dateDao) {
        this.patientDao = patientDao;
        this.attendentDao = attendentDao;
        this.roomDao = roomDao;
        this.healthcareDao = healthcareDao;
        this.dateDao=dateDao;
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

    @Override
    public Date saveDate(PatientJson patientJson) {
        List<Date> dateList = new ArrayList<>();
        Patient patient = new Patient();
        for(int i=0;i<patientJson.getDates().size();i++){
            int year = Integer.parseInt(patientJson.getDates().get(i).substring(0,4));
            int month = Integer.parseInt(patientJson.getDates().get(i).substring(5,7));
            int day = Integer.parseInt(patientJson.getDates().get(i).substring(8,10));
            dateList.add(new Date(day+1,month,year));
            dateDao.save(dateList.get(i));
        }
        patient.setId(patientJson.getId());
        patient.setName(patientJson.getName());
        patient.setGender(patientJson.getGender());
        patient.setAge(patientJson.getAge());
        patient.setContact(patientJson.getContact());
        patient.setAttendent(patientJson.getAttendent());
        patient.setRoom(patientJson.getRoom());
        patient.setHealthcare(patientJson.getHealthcare());
        patient.setDates(dateList);
        patientDao.save(patient);
        return null;
    }

    @Override
    public Healthcare saveHealth(String result) {
        JSONObject jsonObject = new JSONObject(result);
        JSONObject patientObject = jsonObject.getJSONObject("patient");
        JSONObject healthObject = jsonObject.getJSONObject("health");
        JSONArray problems = jsonObject.getJSONArray("problems");
        Patient patient = new Patient();
        patient.setId(patientObject.getInt("id"));
        patient.setGender(patientObject.getString("gender"));
        patient.setContact(patientObject.getString("contact"));
        patient.setAge(patientObject.getInt("age"));
        patient.setName(patientObject.getString("name"));
        List<Date> dateList = patientDao.findById(patientObject.getInt("id")).get().getDates();
        patient.setDates(dateList);
        int attendentId = patientObject.getJSONObject("attendent").getInt("id");
        Attendent attendent = attendentDao.findById(attendentId).get();
        int roomId = patientObject.getJSONObject("room").getInt("id");
        Room room = roomDao.findById(roomId).get();
        patient.setRoom(room);
        patient.setAttendent(attendent);
        Healthcare healthcare = new Healthcare();
        healthcare.setId(0);
        healthcare.setBloodpressure(healthObject.getString("Bloodpressure"));
        healthcare.setCholestrol(healthObject.getString("Cholestrol"));
        healthcare.setHemoglobin(healthObject.getString("Hemoglobin"));
        healthcare.setUricacid(healthObject.getString("Uricacid"));
        healthcare.setSugar(healthObject.getString("Sugar"));
        healthcare.setHasVisionProblem(0);
        healthcare.setHasLegProblem(0);
        healthcare.setHasHeartProblem(0);
        healthcare.setHasHearingProblem(0);
        for(int i=0;i<problems.length();i++){
            JSONObject object = problems.getJSONObject(i);
            if(object.getInt("value")==1){
                healthcare.setHasHearingProblem(1);
            }
            else if(object.getInt("value")==2){
                healthcare.setHasHeartProblem(1);
            }
            else if(object.getInt("value")==3){
                healthcare.setHasLegProblem(1);
            }
            else if(object.getInt("value")==4){
                healthcare.setHasVisionProblem(1);
            }
            else if(object.getInt("value")==5){
                healthcare.setIsClaustrophobic(1);
            }
        }
        healthcareDao.save(healthcare);
        logger.info("[Patient Name] - "+patient.getName()+"[BP] -"+healthcare.getBloodpressure()+"[Hemoglobin] -"+healthcare.getHemoglobin()+"[Sugar] -"+healthcare.getSugar()+"[Cholestrol] -"+healthcare.getCholestrol()+"[Uric Acid] -"+healthcare.getUricacid());
        healthcare.setId(healthcareDao.findAll(Sort.by(Sort.Direction.DESC, "id")).get(0).getId());
        patient.setHealthcare(healthcare);
        patientDao.save(patient);
        return null;
    }
}
