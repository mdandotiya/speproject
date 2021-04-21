package com.example.speproject.service;

import com.example.speproject.dao.AttendentDao;
import com.example.speproject.entity.Attendent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttendentServiceImpl implements AttendentService {

    AttendentDao attendentDao;

    @Autowired
    public AttendentServiceImpl(AttendentDao attendentDao) {
        this.attendentDao = attendentDao;
    }

    @Override
    public List<Attendent> findAll() {
        return attendentDao.findAll();
    }
}
