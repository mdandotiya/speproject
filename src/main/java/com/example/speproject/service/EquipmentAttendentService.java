package com.example.speproject.service;

import com.example.speproject.dao.EquipmentAttendentDao;
import com.example.speproject.entity.EquipmentAttendent;

import java.util.Optional;

public interface EquipmentAttendentService {
    public Optional<EquipmentAttendent> save(EquipmentAttendent equipmentAttendent);
}
