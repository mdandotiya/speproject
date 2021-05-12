package com.example.speproject.JSONEntity;

public class HealthcareJson {
    private String Hemoglobin;
    private String Bloodpressure;
    private String Sugar;
    private String Cholestrol;
    private String Uricacid;

    public HealthcareJson() {
    }

    public HealthcareJson(String hemoglobin, String bloodpressure, String sugar, String cholestrol, String uricacid) {
        Hemoglobin = hemoglobin;
        Bloodpressure = bloodpressure;
        Sugar = sugar;
        Cholestrol = cholestrol;
        Uricacid = uricacid;
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
}
