package com.example.speproject.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class ComplaintStaff {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;

    @Column
    private String name;

    @Column
    private int openComplaints;

    @ManyToMany
    private List<Complaints> complaints;

    public ComplaintStaff(int id, String name, int openComplaints) {
        this.id = id;
        this.name = name;
        this.openComplaints = openComplaints;
    }

    public ComplaintStaff() {

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

    public int isOpenComplaints() {
        return openComplaints;
    }

    public void setOpenComplaints(int openComplaints) {
        this.openComplaints = openComplaints;
    }
}
