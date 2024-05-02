package repository;

import exception.ParkingFloorNotFoundException;
import model.ParkingFloor;

import java.util.Map;

public class ParkingFloorRepo {
    private Map<Integer, ParkingFloor> parkingFloorMap;

    public ParkingFloor getParkingFloor(int parkingFloorId){
        if(!parkingFloorMap.containsKey(parkingFloorId)){
            throw new ParkingFloorNotFoundException("Parking Floor not found");
        }
        ParkingFloor parkingFloor = parkingFloorMap.get(parkingFloorId);
        return parkingFloor;
    }

    public void putParkingFloor(ParkingFloor parkingFloor){
        parkingFloorMap.put(parkingFloor.getId(), parkingFloor);
    }
}
