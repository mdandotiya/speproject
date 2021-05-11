package com.example.speproject.service;

import com.example.speproject.entity.Ngo;
import com.example.speproject.entity.Patient;

import java.util.List;
import java.util.Optional;

public interface NGOService {
    public List<Ngo> findAll();
    public Optional<Ngo> getNgo(int id);
    public void deleteNgo(int id);
    public Ngo save(Ngo ngo);
}
