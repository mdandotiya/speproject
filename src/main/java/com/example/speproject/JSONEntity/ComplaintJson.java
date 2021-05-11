package com.example.speproject.JSONEntity;

public class ComplaintJson {
    private int value;
    private String label;

    public ComplaintJson() {
    }

    public ComplaintJson(int value,String label) {
        this.value=value;
        this.label = label;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
