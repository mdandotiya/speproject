package com.example.speproject.service;

import com.example.speproject.dao.AttendentDao;
import com.example.speproject.dao.PatientDao;
import com.example.speproject.entity.Attendent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AttendentServiceImpl implements AttendentService {

    AttendentDao attendentDao;

    PatientDao patientDao;

    @Autowired
    public AttendentServiceImpl(AttendentDao attendentDao,PatientDao patientDao) {
        this.attendentDao = attendentDao;
        this.patientDao = patientDao;
    }

    @Override
    public List<Attendent> findAll() {
        return attendentDao.findAll();
    }

    @Override
    public Optional<Attendent> findAttendent(int id) {
        return attendentDao.findById(id);
    }

    @Override
    public void deleteAttendent(int id) {
        attendentDao.deleteById(id);
    }

    @Override
    public Optional<Attendent> saveAttendent(Attendent attendent) {
        attendentDao.save(attendent);
        return Optional.empty();
    }
}
