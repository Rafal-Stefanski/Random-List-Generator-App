package com.rafalstefanski.randomlistgenerator.vehicle.model;

public class Vehicle {
    private String mark;
    private String type;

    public Vehicle(String mark, String type) {
        this.mark = mark;
        this.type = type;
    }

    public Vehicle() {
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "mark='" + mark + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
