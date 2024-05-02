package model;

import model.constant.ParkingLotStatus;
import model.constant.VehicleType;
import service.strategy.BillGenerationStrategy;
import service.strategy.SpotBookingStrategy;

import java.util.List;

public class ParkingLot extends  BaseModel{
    private String name;
    private String address;
    private List<ParkingLot> floors;
    private ParkingLotStatus parkingLotStatus;
    private List<VehicleType> vehicleTypesSupported;
    private int capacity;
    private BillGenerationStrategy billGenerationStrategy;
    private SpotBookingStrategy spotBookingStategy;

    public ParkingLot() {
    }

    public ParkingLot(String name, String address, List<ParkingLot> floors, ParkingLotStatus parkingLotStatus, List<VehicleType> vehicleTypesSupported, int capacity, BillGenerationStrategy billGenerationStrategy, SpotBookingStrategy spotBookingStategy) {
        this.name = name;
        this.address = address;
        this.floors = floors;
        this.parkingLotStatus = parkingLotStatus;
        this.vehicleTypesSupported = vehicleTypesSupported;
        this.capacity = capacity;
        this.billGenerationStrategy = billGenerationStrategy;
        this.spotBookingStategy = spotBookingStategy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<ParkingLot> getFloors() {
        return floors;
    }

    public void setFloors(List<ParkingLot> floors) {
        this.floors = floors;
    }

    public ParkingLotStatus getParkingLotStatus() {
        return parkingLotStatus;
    }

    public void setParkingLotStatus(ParkingLotStatus parkingLotStatus) {
        this.parkingLotStatus = parkingLotStatus;
    }

    public List<VehicleType> getVehicleTypesSupported() {
        return vehicleTypesSupported;
    }

    public void setVehicleTypesSupported(List<VehicleType> vehicleTypesSupported) {
        this.vehicleTypesSupported = vehicleTypesSupported;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public BillGenerationStrategy getBillGenerationStrategy() {
        return billGenerationStrategy;
    }

    public void setBillGenerationStrategy(BillGenerationStrategy billGenerationStrategy) {
        this.billGenerationStrategy = billGenerationStrategy;
    }

    public SpotBookingStrategy getSpotBookingStategy() {
        return spotBookingStategy;
    }

    public void setSpotBookingStategy(SpotBookingStrategy spotBookingStategy) {
        this.spotBookingStategy = spotBookingStategy;
    }

    public int getId(){
        return this.id;
    }
}
