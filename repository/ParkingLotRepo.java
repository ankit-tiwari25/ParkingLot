package repository;

import exception.ParkingLotNotFoundException;
import model.ParkingLot;

import java.util.Map;

public class ParkingLotRepo {
    private Map<Integer, ParkingLot> parkingLotMap;

    public ParkingLot getParkingLot(int id){
        if(!parkingLotMap.containsKey(id)){
            throw new ParkingLotNotFoundException("Parking lot not found with id " + id);
        }
            ParkingLot parkingLot = parkingLotMap.get(id);
        return  parkingLot;
    }

    public  void putParkingLot(ParkingLot parkingLot){
        parkingLotMap.put(parkingLot.getId(), parkingLot);
        System.out.println("ParkingLot added successfully");
    }
}
