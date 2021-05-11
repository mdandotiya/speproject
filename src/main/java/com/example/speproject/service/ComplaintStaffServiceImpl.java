package com.example.speproject.service;

import com.example.speproject.JSONEntity.ComplaintStaffJson;
import com.example.speproject.dao.ComplaintStaffDao;
import com.example.speproject.dao.ComplaintsDao;
import com.example.speproject.entity.ComplaintStaff;
import com.example.speproject.entity.Complaints;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ComplaintStaffServiceImpl implements ComplaintStaffService{

    ComplaintStaffDao complaintStaffDao;
    ComplaintsDao complaintsDao;

    public ComplaintStaffServiceImpl(ComplaintStaffDao complaintStaffDao, ComplaintsDao complaintsDao) {
        this.complaintStaffDao = complaintStaffDao;
        this.complaintsDao = complaintsDao;
    }

    @Autowired


    @Override
    public List<ComplaintStaff> findAll() {
        return complaintStaffDao.findAll();
    }

    @Override
    public List<Complaints> findComplaints() {
        return complaintsDao.findAll();
    }

    @Override
    public ComplaintStaff save(ComplaintStaffJson complaintStaffJson) {
        List<Complaints> complaintsList = complaintsDao.findAll();
        ComplaintStaff complaintStaff = new ComplaintStaff();
        List<Complaints> complaints = new ArrayList<>();
        complaintStaff.setId(0);
        complaintStaff.setName(complaintStaffJson.getName());
        complaintStaff.setOpenComplaints(complaintStaffJson.getOpenComplaints());
        for(int i=0; i < complaintStaffJson.getComplaintJsonList().size(); i++) {
            for(int j=0;j<complaintsList.size();j++){
                if(complaintsList.get(j).getId() ==complaintStaffJson.getComplaintJsonList().get(i).getValue()){
                    complaints.add(complaintsList.get(j));
                }
            }
        }
        complaintStaff.setComplaints(complaints);
        complaintStaffDao.save(complaintStaff);

        return null;
    }
}
