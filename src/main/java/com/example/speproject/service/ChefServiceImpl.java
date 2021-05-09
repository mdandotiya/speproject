package com.example.speproject.service;

import com.example.speproject.dao.ChefDao;
import com.example.speproject.entity.Chef;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChefServiceImpl implements ChefService{

    private ChefDao chefDao;

    @Autowired
    public ChefServiceImpl(ChefDao chefDao) {
        this.chefDao = chefDao;
    }


    @Override
    public List<Chef> findAll() {
        return chefDao.findAll();
    }
}
