package repository;

import exception.ParkingSpotNotFoundException;
import model.ParkingSpot;

import java.util.Map;

public class ParkingSpotRepo {
    private Map<Integer, ParkingSpot> parkingSpotMap;

    public ParkingSpot getParkingSpot(int parkingSpotId){
        if(!parkingSpotMap.containsKey(parkingSpotId)){
            throw new ParkingSpotNotFoundException("Parking Spot not found");
        }
        ParkingSpot parkingSpot = parkingSpotMap.get(parkingSpotId);
        return parkingSpot;
    }
}
