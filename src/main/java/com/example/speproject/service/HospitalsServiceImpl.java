package com.example.speproject.service;

import com.example.speproject.dao.HospitalRepository;
import com.example.speproject.entity.Hospitals;

import java.util.List;
import java.util.Optional;

public class HospitalsServiceImpl implements HospitalsService {

    private HospitalRepository hospitalRepository;

    public HospitalsServiceImpl(HospitalRepository hospitalRepository) {
        this.hospitalRepository = hospitalRepository;
    }

    @Override
    public List<Hospitals> listAllHospitals() {
        return hospitalRepository.findAll();
    }

    @Override
    public Hospitals findById(int theId) {
        Optional<Hospitals> result = hospitalRepository.findById(theId);

        Hospitals theHospital =null;

        if(result.isPresent()){
            theHospital=result.get();
        }
        else{
            throw new RuntimeException("Hospital not found");
        }

        return theHospital;
    }

    @Override
    public void save(Hospitals theHospital) {
        hospitalRepository.save(theHospital);
    }

    @Override
    public void deleteById(int theId) {
        hospitalRepository.deleteById(theId);
    }
}
