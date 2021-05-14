package com.example.speproject.JSONEntity;

import com.example.speproject.entity.Healthcare;
import com.example.speproject.entity.Patient;

import java.util.List;

public class AddHealthJson {
    private Patient patient;
    private Healthcare health;
    private List<MultipleSelectJson> problems;

    public AddHealthJson() {
    }

    public AddHealthJson(Patient patient, Healthcare health, List<MultipleSelectJson> problems) {
        this.patient = patient;
        this.health = health;
        this.problems = problems;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Healthcare getHealth() {
        return health;
    }

    public void setHealth(Healthcare health) {
        this.health = health;
    }

    public List<MultipleSelectJson> getProblems() {
        return problems;
    }

    public void setProblems(List<MultipleSelectJson> problems) {
        this.problems = problems;
    }
}
