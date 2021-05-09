package com.example.speproject.dao;

import com.example.speproject.entity.Hospitals;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HospitalDao extends JpaRepository<Hospitals,Integer> {

}
