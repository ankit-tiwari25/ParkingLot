package service.strategy;

import model.ParkingSpot;
import model.Vehicle;

public interface SpotBookingStrategy {
    ParkingSpot getSpotForVehicle(Vehicle vehicle);
}
