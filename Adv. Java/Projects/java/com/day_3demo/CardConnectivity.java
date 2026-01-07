package com.day_3demo;

//Data Access Layer
public interface CardConnectivity {
    boolean isValid(String card_no, String name, String expiry_date, String cvv);
}
