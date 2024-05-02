package service.strategy;

import model.Gate;
import model.ParkingFloor;
import model.ParkingLot;
import model.ParkingSpot;
import model.constant.*;
import repository.GateRepo;
import repository.ParkingFloorRepo;
import repository.ParkingLotRepo;
import repository.ParkingSpotRepo;

import java.util.ArrayList;
import java.util.List;

public class InitializationService {
    private GateRepo gateRepo;
    private ParkingSpotRepo parkingSpotRepo;
    private ParkingFloorRepo parkingFloorRepo;
    private ParkingLotRepo parkingLotRepo;

    public InitializationService(GateRepo gateRepo, ParkingSpotRepo parkingSpotRepo, ParkingFloorRepo parkingFloorRepo, ParkingLotRepo parkingLotRepo) {
        this.gateRepo = gateRepo;
        this.parkingSpotRepo = parkingSpotRepo;
        this.parkingFloorRepo = parkingFloorRepo;
        this.parkingLotRepo = parkingLotRepo;
    }

    public void init(){
        System.out.println("*********** STARTING WITH PARKING LOT ***********");

        //Creating ParkingLot ka object
        ParkingLot parkingLot = new ParkingLot();
        parkingLot.setAddress("Somewhere on earth");
        parkingLot.setName("INOX Mall parking center");
        parkingLot.setParkingLotStatus(ParkingLotStatus.EMPTY);
        parkingLot.setCapacity(100); // 10 Floors, 10 spots each floor

        List<ParkingFloor> floors = new ArrayList<>();

        //Creating 10 floors
        for(int i = 1; i <= 10; i++){
            ParkingFloor parkingFloor = new ParkingFloor();
            parkingFloor.setId(i);
            parkingFloor.setFloorNumber(i);
            parkingFloor.setParkingFloorStatus(ParkingFloorStatus.EMPTY);

            List<ParkingSpot> spots = new ArrayList<>();
            //Creating 10 ParkingSpots
            for(int j = 1; j <= 10; j++){
                ParkingSpot parkingSpot = new ParkingSpot();
                parkingSpot.setId(i*100 + j);
                parkingSpot.setVehicleType(VehicleType.FOUR_WHEELER);
                parkingSpot.setParkingSpotStatus(ParkingSpotStatus.EMPTY);
                parkingSpotRepo.putParkingSpot(parkingSpot);
                spots.add(parkingSpot);

            }
            //Creating entry gate object
            Gate entryGate = new Gate();
            entryGate.setGateNumber(i*10 + i);
            entryGate.setGateStatus(GateStatus.OPEN);
            entryGate.setGateType(GateType.ENTRY);
            entryGate.setOperatorName("Operator id : " + "0"+i);
            gateRepo.putGate(entryGate);

            parkingFloor.setEntryGate(entryGate);

            //Creating exit gate object

            Gate exitGate = new Gate();
            exitGate.setGateType(GateType.EXIT);
            exitGate.setGateNumber(i*10 + i);
            exitGate.setGateStatus(GateStatus.OPEN);
            exitGate.setOperatorName("Operator id : " + "0"+i);

            gateRepo.putGate(exitGate);
            parkingFloor.setExitGate(exitGate);




            floors.add(parkingFloor);
            parkingFloorRepo.putParkingFloor(parkingFloor);
        }
        parkingLot.setFloors(floors);
        parkingLotRepo.putParkingLot(parkingLot);

    }
}
