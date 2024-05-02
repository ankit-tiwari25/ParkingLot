package repository;

import exception.ParkingFloorNotFoundException;
import model.ParkingFloor;

import java.util.HashMap;
import java.util.Map;

public class ParkingFloorRepo {
    private Map<Integer, ParkingFloor> parkingFloorMap;

    public ParkingFloorRepo() {
        this.parkingFloorMap = new HashMap<>();
    }


    public ParkingFloor getParkingFloor(int parkingFloorId){
        if(!parkingFloorMap.containsKey(parkingFloorId)){
            throw new ParkingFloorNotFoundException("Parking Floor not found");
        }
        ParkingFloor parkingFloor = parkingFloorMap.get(parkingFloorId);
        return parkingFloor;
    }

    public void putParkingFloor(ParkingFloor parkingFloor){

        parkingFloorMap.put(parkingFloor.getId(), parkingFloor);
        System.out.println("Parking Floor added successfully. Parking Floor id : " + parkingFloor.getId());
    }
}
