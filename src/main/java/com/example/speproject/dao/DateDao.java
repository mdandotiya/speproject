package com.example.speproject.dao;

import com.example.speproject.entity.Date;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DateDao extends JpaRepository<Date,Integer> {
}
