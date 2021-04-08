package com.example.speproject.entity;

import javax.persistence.*;

@Entity
@Table(name = "Complaints")
public class Complaints {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "detail")
    private String detail;

    @Column(name = "open")
    private boolean open;

    public Complaints(int id, String detail, boolean open) {
        this.id = id;
        this.detail = detail;
        this.open = open;
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
