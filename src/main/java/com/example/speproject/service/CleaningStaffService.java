package com.example.speproject.service;

import com.example.speproject.entity.CleaningStaff;

import java.util.List;

public interface CleaningStaffService {
    public List<CleaningStaff> findAll();
    public List<CleaningStaff> save(CleaningStaff cleaningStaff);
}
