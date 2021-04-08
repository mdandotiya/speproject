package com.example.speproject.entity;

import javax.persistence.*;

@Entity
@Table(name="EquipmentAssign")
public class EquipmentAssign {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "attendentid")
    private int attendentid;

    @Column(name = "Equimentid")
    private int Equipmentid;

    public EquipmentAssign(int attendentid, int equipmentid) {
        this.attendentid = attendentid;
        Equipmentid = equipmentid;
    }

    public EquipmentAssign() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAttendentid() {
        return attendentid;
    }

    public void setAttendentid(int attendentid) {
        this.attendentid = attendentid;
    }

    public int getEquipmentid() {
        return Equipmentid;
    }

    public void setEquipmentid(int equipmentid) {
        Equipmentid = equipmentid;
    }
}
