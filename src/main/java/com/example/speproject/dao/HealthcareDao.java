package com.example.speproject.dao;

import com.example.speproject.entity.Healthcare;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HealthcareDao extends JpaRepository<Healthcare,Integer> {
}
