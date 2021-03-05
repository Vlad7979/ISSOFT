package com.company;

import java.text.SimpleDateFormat;

public class Order {
    private String id;
//    private SimpleDateFormat simpleDateFormat =
//            new SimpleDateFormat("yyyy-MM-ddThh:mm:ss");
    private String date;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return id + " " + date;
    }
}
