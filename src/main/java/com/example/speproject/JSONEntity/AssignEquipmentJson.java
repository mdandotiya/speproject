package com.example.speproject.JSONEntity;

import com.example.speproject.entity.Attendent;
import com.example.speproject.entity.HealthEquipment;

public class AssignEquipmentJson {
    private Attendent attendent;
    private HealthEquipment healthEquipment;

    public AssignEquipmentJson() {
    }

    public AssignEquipmentJson(Attendent attendent, HealthEquipment healthEquipment) {
        this.attendent = attendent;
        this.healthEquipment = healthEquipment;
    }

    public Attendent getAttendent() {
        return attendent;
    }

    public void setAttendent(Attendent attendent) {
        this.attendent = attendent;
    }

    public HealthEquipment getHealthEquipment() {
        return healthEquipment;
    }

    public void setHealthEquipment(HealthEquipment healthEquipment) {
        this.healthEquipment = healthEquipment;
    }
}
