import controller.InitializationController;
import model.ParkingFloor;
import repository.GateRepo;
import repository.ParkingFloorRepo;
import repository.ParkingLotRepo;
import repository.ParkingSpotRepo;
import service.strategy.InitializationService;

public class Main {
    public static void main(String[] args) {
        ParkingLotRepo parkingLotRepo = new ParkingLotRepo();
        ParkingFloorRepo parkingFloorRepo = new ParkingFloorRepo();
        ParkingSpotRepo parkingSpotRepo  = new ParkingSpotRepo();
        GateRepo gateRepo = new GateRepo();

        InitializationService initializationService = new InitializationService(
                gateRepo,parkingSpotRepo, parkingFloorRepo, parkingLotRepo);

        InitializationController initializationController = new InitializationController(initializationService);
        initializationController.init();
        System.out.println("END");


    }
}
