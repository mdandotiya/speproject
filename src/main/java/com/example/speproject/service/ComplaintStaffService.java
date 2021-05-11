package com.example.speproject.service;

import com.example.speproject.JSONEntity.ComplaintStaffJson;
import com.example.speproject.entity.ComplaintStaff;
import com.example.speproject.entity.Complaints;

import java.util.List;

public interface ComplaintStaffService {
    public List<ComplaintStaff> findAll();
    public List<Complaints> findComplaints();
    public ComplaintStaff save(ComplaintStaffJson complaintStaffJson);
}
