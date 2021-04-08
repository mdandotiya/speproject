package com.example.speproject.entity;

import javax.persistence.*;

@Entity
@Table(name = "Complaintstaff")
public class ComplaintStaff {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "opencomplaints")
    private boolean openComplaints;

    public ComplaintStaff(int id, String name, boolean openComplaints) {
        this.id = id;
        this.name = name;
        this.openComplaints = openComplaints;
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

    public boolean isOpenComplaints() {
        return openComplaints;
    }

    public void setOpenComplaints(boolean openComplaints) {
        this.openComplaints = openComplaints;
    }
}
