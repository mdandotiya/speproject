package com.example.speproject.JSONEntity;

import com.example.speproject.entity.Luxuryresource;
import com.example.speproject.entity.Patient;

public class AssignResourceJson {
    private Patient patient;
    private Luxuryresource resource;

    public AssignResourceJson() {
    }

    public AssignResourceJson(Patient patient, Luxuryresource resource) {
        this.patient = patient;
        this.resource = resource;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Luxuryresource getResource() {
        return resource;
    }

    public void setResource(Luxuryresource resource) {
        this.resource = resource;
    }
}
