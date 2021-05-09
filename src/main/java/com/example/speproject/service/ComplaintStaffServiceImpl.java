package com.example.speproject.service;

import com.example.speproject.dao.ComplaintStaffDao;
import com.example.speproject.entity.ComplaintStaff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComplaintStaffServiceImpl implements ComplaintStaffService{

    ComplaintStaffDao complaintStaffDao;

    @Autowired
    public ComplaintStaffServiceImpl(ComplaintStaffDao complaintStaffDao) {
        this.complaintStaffDao = complaintStaffDao;
    }

    @Override
    public List<ComplaintStaff> findAll() {
        return complaintStaffDao.findAll();
    }
}
