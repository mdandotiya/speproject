package com.example.speproject.dao;

import com.example.speproject.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorDao extends JpaRepository<Doctor,Integer> {
}
