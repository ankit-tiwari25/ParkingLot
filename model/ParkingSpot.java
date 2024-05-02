package model;

import model.constant.ParkingSpotStatus;
import model.constant.VehicleType;

public class ParkingSpot extends BaseModel{
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int number;
    private VehicleType vehicleType;
    private Vehicle vehicle;
    private ParkingSpotStatus parkingSpotStatus;

    public ParkingSpotStatus getParkingSpotStatus() {
        return parkingSpotStatus;
    }

    public void setParkingSpotStatus(ParkingSpotStatus parkingSpotStatus) {
        this.parkingSpotStatus = parkingSpotStatus;
    }

    public ParkingSpot() {
    }

    public ParkingSpot(int id, int number, VehicleType vehicleType, Vehicle vehicle) {
        this.id = id;
        this.number = number;
        this.vehicleType = vehicleType;
        this.vehicle = vehicle;
    }



    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
