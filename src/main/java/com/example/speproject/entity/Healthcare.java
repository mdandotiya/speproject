package com.example.speproject.entity;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table
public class Healthcare implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String Hemoglobin;

    @Column
    private String Bloodpressure;

    @Column
    private String Sugar;

    @Column
    private String Cholestrol;

    @Column
    private String Uricacid;

    @Column
    private int hasLegProblem;

    @Column
    private int hasVisionProblem;

    @Column
    private int hasHearingProblem;

    @Column
    private int hasHeartProblem;

    @Column
    private int isClaustrophobic;


    public Healthcare(String hemoglobin, String bloodpressure, String sugar, String cholestrol, String uricacid, int hasLegProblem, int hasVisionProblem, int hasHearingProblem, int hasHeartProblem, int isClaustrophobic) {
        Hemoglobin = hemoglobin;
        Bloodpressure = bloodpressure;
        Sugar = sugar;
        Cholestrol = cholestrol;
        Uricacid = uricacid;
        this.hasLegProblem = hasLegProblem;
        this.hasVisionProblem = hasVisionProblem;
        this.hasHearingProblem = hasHearingProblem;
        this.hasHeartProblem = hasHeartProblem;
        this.isClaustrophobic = isClaustrophobic;
    }

    public Healthcare() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHemoglobin() {
        return Hemoglobin;
    }

    public void setHemoglobin(String hemoglobin) {
        Hemoglobin = hemoglobin;
    }

    public String getBloodpressure() {
        return Bloodpressure;
    }

    public void setBloodpressure(String bloodpressure) {
        Bloodpressure = bloodpressure;
    }

    public String getSugar() {
        return Sugar;
    }

    public void setSugar(String sugar) {
        Sugar = sugar;
    }

    public String getCholestrol() {
        return Cholestrol;
    }

    public void setCholestrol(String cholestrol) {
        Cholestrol = cholestrol;
    }

    public String getUricacid() {
        return Uricacid;
    }

    public void setUricacid(String uricacid) {
        Uricacid = uricacid;
    }

    public int getHasLegProblem() {
        return hasLegProblem;
    }

    public void setHasLegProblem(int hasLegProblem) {
        this.hasLegProblem = hasLegProblem;
    }

    public int getHasVisionProblem() {
        return hasVisionProblem;
    }

    public void setHasVisionProblem(int hasVisionProblem) {
        this.hasVisionProblem = hasVisionProblem;
    }

    public int getHasHearingProblem() {
        return hasHearingProblem;
    }

    public void setHasHearingProblem(int hasHearingProblem) {
        this.hasHearingProblem = hasHearingProblem;
    }

    public int getHasHeartProblem() {
        return hasHeartProblem;
    }

    public void setHasHeartProblem(int hasHeartProblem) {
        this.hasHeartProblem = hasHeartProblem;
    }

    public int getIsClaustrophobic() {
        return isClaustrophobic;
    }

    public void setIsClaustrophobic(int isClaustrophobic) {
        this.isClaustrophobic = isClaustrophobic;
    }
}
