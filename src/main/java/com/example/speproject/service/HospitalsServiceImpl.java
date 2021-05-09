package com.example.speproject.service;

import com.example.speproject.dao.HospitalDao;
import com.example.speproject.entity.Hospitals;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HospitalsServiceImpl implements HospitalsService {

    private HospitalDao hospitalDao;

    public HospitalsServiceImpl(HospitalDao hospitalDao) {
        this.hospitalDao = hospitalDao;
    }

    @Override
    public List<Hospitals> listAllHospitals() {
        return hospitalDao.findAll();
    }

    @Override
    public Hospitals findById(int theId) {
        Optional<Hospitals> result = hospitalDao.findById(theId);

        Hospitals theHospital;

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
        hospitalDao.save(theHospital);
    }

    @Override
    public void deleteById(int theId) {
        hospitalDao.deleteById(theId);
    }
}
