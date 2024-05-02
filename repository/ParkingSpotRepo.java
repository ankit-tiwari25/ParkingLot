package repository;

import exception.ParkingSpotNotFoundException;
import model.ParkingSpot;

import java.util.HashMap;
import java.util.Map;

public class ParkingSpotRepo {
    private Map<Integer, ParkingSpot> parkingSpotMap;

    public ParkingSpotRepo() {
        this.parkingSpotMap = new HashMap<>();
    }



    public ParkingSpot getParkingSpot(int parkingSpotId){
        if(!parkingSpotMap.containsKey(parkingSpotId)){
            throw new ParkingSpotNotFoundException("Parking Spot not found");
        }
        ParkingSpot parkingSpot = parkingSpotMap.get(parkingSpotId);
        return parkingSpot;
    }

    public void putParkingSpot(ParkingSpot parkingSpot){

        parkingSpotMap.put(parkingSpot.getId(), parkingSpot);
        System.out.println("Parking Spot added successfully. Parking Spot id : "+parkingSpot.getId());
    }
}
