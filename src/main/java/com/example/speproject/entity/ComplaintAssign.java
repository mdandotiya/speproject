package com.example.speproject.entity;

import javax.persistence.*;

@Entity
@Table(name = "Complaintassign")
public class ComplaintAssign {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "staffid")
    private int staffId;

    @Column(name = "complaintid")
    private int complaintId;

    public ComplaintAssign() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public int getComplaintId() {
        return complaintId;
    }

    public void setComplaintId(int complaintId) {
        this.complaintId = complaintId;
    }
}
