package com.example.speproject.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Complaints {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;

    @Column
    private String detail;

    @Column
    private boolean open;


    public Complaints(String detail, boolean open) {
        this.detail = detail;
        this.open = open;
    }

    public Complaints() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }
}
