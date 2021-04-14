package com.example.speproject.dao;

import com.example.speproject.entity.Hospitals;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HospitalRepository extends JpaRepository<Hospitals,Integer> {

}
