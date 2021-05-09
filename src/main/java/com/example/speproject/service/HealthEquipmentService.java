package com.example.speproject.service;

import com.example.speproject.entity.HealthEquipment;

import java.util.List;
import java.util.Optional;

public interface HealthEquipmentService {
    public List<HealthEquipment> findAll();
    public Optional<HealthEquipment> addEquipment(HealthEquipment healthEquipment);
}
