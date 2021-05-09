package com.example.speproject.dao;

import com.example.speproject.entity.Luxuryresource;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LuxuryResourceDao extends JpaRepository<Luxuryresource,Integer> {
}
