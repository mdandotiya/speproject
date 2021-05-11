package com.example.speproject.dao;

import com.example.speproject.entity.Complaints;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComplaintsDao extends JpaRepository<Complaints,Integer> {
}
