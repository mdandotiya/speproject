package com.example.speproject.dao;

import com.example.speproject.entity.Chef;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ChefDao extends JpaRepository<Chef,Integer> {

}
