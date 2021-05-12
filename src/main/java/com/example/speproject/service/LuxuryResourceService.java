package com.example.speproject.service;

import com.example.speproject.JSONEntity.AssignResourceJson;
import com.example.speproject.entity.Luxuryresource;

import java.util.List;
import java.util.Optional;

public interface LuxuryResourceService {
    public List<Luxuryresource> findAll();
    public Optional<Luxuryresource> addResource(Luxuryresource luxuryresource);
    public Optional<Luxuryresource> assignResource(AssignResourceJson assignResourceJson);
}
