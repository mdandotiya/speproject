package com.example.speproject.dao;

import com.example.speproject.entity.Attendent;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AttendentDao extends JpaRepository<Attendent,Integer> {
}
