package com.api.soccer.model;

public class Fixture {
    private String message;

    public Fixture(){}
    public Fixture(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
