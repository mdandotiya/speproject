package com.example.speproject.service;

import com.example.speproject.dao.EquipmentAttendentDao;
import com.example.speproject.entity.EquipmentAttendent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EquipmentAttendentServiceImpl implements EquipmentAttendentService
{
    EquipmentAttendentDao equipmentAttendentDao;

    @Autowired
    public EquipmentAttendentServiceImpl(EquipmentAttendentDao equipmentAttendentDao) {
        this.equipmentAttendentDao = equipmentAttendentDao;
    }


    @Override
    public Optional<EquipmentAttendent> save(EquipmentAttendent equipmentAttendent) {
        equipmentAttendentDao.save(equipmentAttendent);
        return Optional.empty();
    }
}
