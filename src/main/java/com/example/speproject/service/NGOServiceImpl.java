package com.example.speproject.service;

import com.example.speproject.dao.NGODao;
import com.example.speproject.entity.Ngo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NGOServiceImpl implements NGOService{

    NGODao ngoDao;

    @Autowired
    public NGOServiceImpl(NGODao ngoDao) {
        this.ngoDao = ngoDao;
    }

    @Override
    public List<Ngo> findAll() {
        return ngoDao.findAll();
    }

    @Override
    public Optional<Ngo> getNgo(int id) {
        return ngoDao.findById(id);
    }

    @Override
    public void deleteNgo(int id) {
        ngoDao.deleteById(id);
    }

    @Override
    public Ngo save(Ngo ngo) {
        ngoDao.save(ngo);
        return null;
    }
}
