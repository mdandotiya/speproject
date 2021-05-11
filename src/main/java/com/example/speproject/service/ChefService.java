package com.example.speproject.service;

import com.example.speproject.JSONEntity.ChefJson;
import com.example.speproject.entity.Chef;

import java.util.List;
import java.util.Optional;

public interface ChefService {
    public List<Chef> findAll();
    public Optional<Chef> save(ChefJson chef);
}
