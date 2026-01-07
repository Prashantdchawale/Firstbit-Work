package com.day_3demo;

//Business Logic
public class VerifyUser {

    public boolean isValid(String v1, String v2, String v3, String v4) {

        CardConnectivity ref = new DatabaseConnectivity();
        return ref.isValid(v1, v2, v3, v4);

    }
}
