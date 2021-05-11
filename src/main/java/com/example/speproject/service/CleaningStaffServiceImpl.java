package com.example.speproject.service;

import com.example.speproject.dao.CleaningStaffDao;
import com.example.speproject.entity.CleaningStaff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CleaningStaffServiceImpl implements CleaningStaffService{

    CleaningStaffDao cleaningStaffDao;

    @Autowired
    public CleaningStaffServiceImpl(CleaningStaffDao cleaningStaffDao) {
        this.cleaningStaffDao = cleaningStaffDao;
    }


    @Override
    public List<CleaningStaff> findAll() {
        return cleaningStaffDao.findAll();
    }

    @Override
    public List<CleaningStaff> save(CleaningStaff cleaningStaff) {
        cleaningStaffDao.save(cleaningStaff);
        return null;
    }
}
