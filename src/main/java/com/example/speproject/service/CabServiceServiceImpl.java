package com.example.speproject.service;

import com.example.speproject.JSONEntity.CabServiceJson;
import com.example.speproject.dao.CabServiceDao;
import com.example.speproject.dao.DateDao;
import com.example.speproject.entity.CabService;
import com.example.speproject.entity.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CabServiceServiceImpl implements CabServiceService{

    CabServiceDao cabServiceDao;
    DateDao dateDao;

    public CabServiceServiceImpl(CabServiceDao cabServiceDao, DateDao dateDao) {
        this.cabServiceDao = cabServiceDao;
        this.dateDao = dateDao;
    }

    @Autowired



    @Override
    public List<CabService> listAllCabServices() {
        return cabServiceDao.findAll();
    }

    @Override
    public Optional<CabService> findById(int theId) {
        return cabServiceDao.findById(theId);
    }

    @Override
    public void save(CabServiceJson cabServiceJson)
    {
            CabService cabService = new CabService();
            List<Date> dates = new ArrayList<>();
            for(int i=0;i<cabServiceJson.getDates().size();i++){
                int year = Integer.parseInt(cabServiceJson.getDates().get(i).substring(0,4));
                int month = Integer.parseInt(cabServiceJson.getDates().get(i).substring(5,7));
                int day = Integer.parseInt(cabServiceJson.getDates().get(i).substring(8,10));
                dates.add(new Date(day+1,month,year));
                dateDao.save(dates.get(i));
            }
            cabService.setId(cabServiceJson.getId());
            cabService.setName(cabServiceJson.getName());
            cabService.setNoOfCabs(cabServiceJson.getNoOfCabs());
            cabService.setTotalAmount(cabServiceJson.getTotalAmount());
            cabService.setDates(dates);
            cabServiceDao.save(cabService);
    }

    @Override
    public void deleteById(int theId) {
            cabServiceDao.deleteById(theId);
    }
}
