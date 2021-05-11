package com.example.speproject.service;

import com.example.speproject.JSONEntity.CabServiceJson;
import com.example.speproject.entity.CabService;

import java.util.List;
import java.util.Optional;

public interface CabServiceService {
    List<CabService> listAllCabServices();
    Optional<CabService> findById(int theId);
    void save(CabServiceJson cabServiceJson);
    void deleteById(int theId);
}
