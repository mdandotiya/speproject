package com.example.speproject.service;

import com.example.speproject.entity.Attendent;

import java.util.List;
import java.util.Optional;

public interface AttendentService {
    public List<Attendent> findAll();
    public Optional<Attendent> findAttendent(int id);
    public void deleteAttendent(int id);
    public Optional<Attendent> saveAttendent(Attendent attendent);
}
