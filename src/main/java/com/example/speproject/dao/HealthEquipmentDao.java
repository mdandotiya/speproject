package com.example.speproject.dao;

import com.example.speproject.entity.HealthEquipment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HealthEquipmentDao extends JpaRepository<HealthEquipment,Integer> {

}
