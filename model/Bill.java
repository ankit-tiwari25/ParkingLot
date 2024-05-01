package model;

import model.constant.BillStatus;

import java.time.LocalDateTime;

public class Bill extends  BaseModel{
    private LocalDateTime exitTime;
    private BillStatus billStatus;
    private double amount;
    private Ticket ticket;
    private Gate exitGate;

    public Bill(LocalDateTime exitTime, BillStatus status, double amount, Ticket ticket, Gate exitGate) {
        this.exitTime = exitTime;
        this.billStatus = status;
        this.amount = amount;
        this.ticket = ticket;
        this.exitGate = exitGate;
    }

    public Bill() {
    }

    public LocalDateTime getExitTime() {
        return exitTime;
    }

    public void setExitTime(LocalDateTime exitTime) {
        this.exitTime = exitTime;
    }

    public BillStatus getStatus() {
        return billStatus;
    }

    public void setStatus(BillStatus status) {
        this.billStatus = status;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public Gate getExitGate() {
        return exitGate;
    }

    public void setExitGate(Gate exitGate) {
        this.exitGate = exitGate;
    }
}

