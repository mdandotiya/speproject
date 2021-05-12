package com.example.speproject.service;

import com.example.speproject.JSONEntity.AssignEquipmentJson;
import com.example.speproject.dao.HealthEquipmentDao;
import com.example.speproject.entity.Attendent;
import com.example.speproject.entity.HealthEquipment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class HealthEquipmentServiceImpl implements HealthEquipmentService{

    HealthEquipmentDao healthEquipmentDao;

    @Autowired
    public HealthEquipmentServiceImpl(HealthEquipmentDao healthEquipmentDao) {
        this.healthEquipmentDao = healthEquipmentDao;
    }

    @Override
    public List<HealthEquipment> findAll() {
       return healthEquipmentDao.findAll();
    }

    @Override
    public Optional<HealthEquipment> addEquipment(HealthEquipment healthEquipment) {
        healthEquipmentDao.save(healthEquipment);
        return Optional.empty();
    }

    @Override
    public Optional<HealthEquipment> assignEquipment(AssignEquipmentJson assignEquipmentJson) {
        HealthEquipment healthEquipment = new HealthEquipment();
        healthEquipment.setId(assignEquipmentJson.getHealthEquipment().getId());
        healthEquipment.setAvailability(assignEquipmentJson.getHealthEquipment().getAvailability());
        healthEquipment.setName(assignEquipmentJson.getHealthEquipment().getName());
        List<Attendent> attendentList = new ArrayList<>();
        attendentList.add(assignEquipmentJson.getAttendent());
        healthEquipment.setAttendents(attendentList);
        healthEquipmentDao.save(healthEquipment);
        return Optional.empty();
    }
}
