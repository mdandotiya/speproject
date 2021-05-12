package com.example.speproject.service;

import com.example.speproject.dao.DateDao;
import com.example.speproject.dao.FundDatadao;
import com.example.speproject.dao.NGODao;
import com.example.speproject.entity.Date;
import com.example.speproject.entity.FundData;
import com.example.speproject.entity.Ngo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class NGOServiceImpl implements NGOService{

    NGODao ngoDao;
    DateDao dateDao;
    FundDatadao fundDatadao;

    @Autowired
    public NGOServiceImpl(NGODao ngoDao, DateDao dateDao,FundDatadao fundDatadao) {
        this.ngoDao = ngoDao;
        this.dateDao = dateDao;
        this.fundDatadao=fundDatadao;
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
        Ngo ngo1 = new Ngo();
        FundData fundData = new FundData();
        Date date = new Date();
        String currentDate = String.valueOf(java.time.LocalDate.now());
        date.setId(0);
        date.setYear(Integer.parseInt(currentDate.substring(0,4)));
        date.setMonth(Integer.parseInt(currentDate.substring(5,7)));
        date.setDay(Integer.parseInt(currentDate.substring(8,10)));
        dateDao.save(date);
        fundData.setDate(date);
        fundData.setId(0);
        fundData.setAmount((int)Math.round(ngo.getRaisedFunds()));
        fundDatadao.save(fundData);
        List<FundData> fundDataList = new ArrayList<>();
        fundDataList.add(fundData);
        ngo1.setId(0);
        List<Ngo> ngos=ngoDao.findAll();
        ngo1.setName(ngo.getName());
        ngo1.setFundData(fundDataList);
        for(int i=0;i<ngos.size();i++){
            if(ngos.get(i).getName().equals(ngo1.getName())){
                ngo1.setId(ngos.get(i).getId());
            }
        }
        ngoDao.save(ngo1);
        return null;
    }
}
