package model;

import java.time.LocalDateTime;

public class Bill {
    private int id;
    private LocalDateTime exitTime;
    private double amount;
    private Ticket ticket;
    private Gate exitGate;
}
