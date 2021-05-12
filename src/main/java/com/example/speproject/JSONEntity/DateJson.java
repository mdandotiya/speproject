package com.example.speproject.JSONEntity;

import java.util.List;

public class DateJson {
    private List<String> dates;

    public DateJson() {
    }

    public DateJson(List<String> dates) {
        this.dates = dates;
    }

    public List<String> getDates() {
        return dates;
    }

    public void setDates(List<String> dates) {
        this.dates = dates;
    }
}
