package model;

import java.time.LocalDateTime;

public class Ticket {
    private int id;
    private ParkingSpot parkingSpot;
    private Vehicle vehicle;
    private LocalDateTime entryTime;

    public Ticket() {
    }

    public Ticket(int id, ParkingSpot parkingSpot, Vehicle vehicle, LocalDateTime entryTime) {
        this.id = id;
        this.parkingSpot = parkingSpot;
        this.vehicle = vehicle;
        this.entryTime = entryTime;
    }
}
