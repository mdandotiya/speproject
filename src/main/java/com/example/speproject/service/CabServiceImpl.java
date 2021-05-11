package com.example.speproject.service;

import com.example.speproject.dao.CabDao;
import com.example.speproject.entity.Cab;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CabServiceImpl implements CabService{

    CabDao cabDao;

    @Autowired
    public CabServiceImpl(CabDao cabDao) {
        this.cabDao = cabDao;
    }


    @Override
    public List<Cab> findAll() {
        return cabDao.findAll();
    }
}
