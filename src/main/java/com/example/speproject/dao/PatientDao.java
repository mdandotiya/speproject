package com.example.speproject.dao;

import com.example.speproject.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientDao extends JpaRepository<Patient,Integer> {
}
