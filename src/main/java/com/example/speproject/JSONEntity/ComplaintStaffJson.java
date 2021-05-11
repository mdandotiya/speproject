package com.example.speproject.JSONEntity;

import java.util.List;

public class ComplaintStaffJson {
    private int id;
    private String name;
    private int openComplaints;

    private List<ComplaintJson> complaintJsonList;

    public ComplaintStaffJson(int id, String name, int openComplaints, List<ComplaintJson> complaintJsonList) {
        this.id = id;
        this.name = name;
        this.openComplaints = openComplaints;
        this.complaintJsonList = complaintJsonList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOpenComplaints() {
        return openComplaints;
    }

    public void setOpenComplaints(int openComplaints) {
        this.openComplaints = openComplaints;
    }

    public List<ComplaintJson> getComplaintJsonList() {
        return complaintJsonList;
    }

    public void setComplaintJsonList(List<ComplaintJson> complaintJsonList) {
        this.complaintJsonList = complaintJsonList;
    }
}
