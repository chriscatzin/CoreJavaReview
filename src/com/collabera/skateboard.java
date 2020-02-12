package com.collabera;

public class skateboard {

    private String name;
    private int size;
    private String wheels;
    private String trucks;
    private String bearings;

    public skateboard(String name, int size, String wheels, String trucks, String bearings) {
        this.name = name;
        this.size = size;
        this.wheels = wheels;
        this.trucks = trucks;
        this.bearings = bearings;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public String getWheels() {
        return wheels;
    }

    public String getTrucks() {
        return trucks;
    }

    public String getBearings() {
        return bearings;
    }
}
