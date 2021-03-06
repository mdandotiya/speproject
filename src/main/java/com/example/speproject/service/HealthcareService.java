package com.example.speproject.service;

import com.example.speproject.JSONEntity.HealthcareJson;
import com.example.speproject.entity.Healthcare;

import java.util.List;
import java.util.Optional;

public interface HealthcareService {
    public List<Healthcare> getHealth();
    public Optional<Healthcare> findById(int id);
    public Optional<Healthcare> addHealth(HealthcareJson healthcareJson);
    public void deleteHealth(int id);
}
