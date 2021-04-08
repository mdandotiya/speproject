package com.example.speproject.entity;

import javax.persistence.*;

@Entity
@Table(name = "Cleaningschedule")
public class CleaningSchedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "staffid")
    private int staffId;

    @Column(name = "dateid")
    private int dateId;

    public CleaningSchedule() {
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

    public int getDateId() {
        return dateId;
    }

    public void setDateId(int dateId) {
        this.dateId = dateId;
    }
}
