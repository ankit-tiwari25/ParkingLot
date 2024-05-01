package model;

import model.constant.VehicleType;

public class Vehicle {
    private int id;
    private String vehicleNumber;
    private VehicleType vehicleType;
    private String color;

    public Vehicle() {
    }

    public Vehicle(int id, String vehicleNumber, VehicleType vehicleType, String color) {
        this.id = id;
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
        this.color = color;
    }
}
