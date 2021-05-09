package com.example.speproject.entity;

import javax.persistence.*;

@Entity
@Table(name = "HealthEquipment_Attendent")
public class EquipmentAttendent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name = "HealthEquipment_id")
    private int healthid;

    @Column(name = "attendents_id")
    private int attendentid;

    public EquipmentAttendent(int healthid, int attendentid) {
        this.healthid = healthid;
        this.attendentid = attendentid;
    }

    public EquipmentAttendent() {

    }

    public int getHealthid() {
        return healthid;
    }

    public void setHealthid(int healthid) {
        this.healthid = healthid;
    }

    public int getAttendentid() {
        return attendentid;
    }

    public void setAttendentid(int attendentid) {
        this.attendentid = attendentid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
