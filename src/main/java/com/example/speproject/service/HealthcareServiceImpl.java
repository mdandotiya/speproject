package com.example.speproject.service;

import com.example.speproject.JSONEntity.HealthcareJson;
import com.example.speproject.dao.HealthcareDao;
import com.example.speproject.entity.Healthcare;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HealthcareServiceImpl implements HealthcareService{

    HealthcareDao healthcareDao;

    @Autowired
    public HealthcareServiceImpl(HealthcareDao healthcareDao) {
        this.healthcareDao = healthcareDao;
    }

    @Override
    public List<Healthcare> getHealth() {
        return healthcareDao.findAll();
    }

    @Override
    public Optional<Healthcare> findById(int id) {
        return healthcareDao.findById(id);
    }

    @Override
    public Optional<Healthcare> addHealth(HealthcareJson healthcareJson) {
        return Optional.empty();
    }

    @Override
    public void deleteHealth(int id) {
        healthcareDao.deleteById(id);

    }
}
