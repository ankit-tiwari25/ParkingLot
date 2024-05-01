package model;

import model.constant.PaymentMode;
import model.constant.PaymentStatus;

import java.time.LocalDateTime;

public class Payment extends BaseModel{
    private int id;
    private double amount;
    private PaymentMode paymentMode;
    private Bill bill;
    private String referenceNumber;
    private PaymentStatus paymentStatus;
    private LocalDateTime paymentTime;

    public Payment() {
    }

    public Payment(int id, double amount, PaymentMode paymentMode, Bill bill, String referenceNumber, PaymentStatus paymentStatus, LocalDateTime paymentTime) {
        this.id = id;
        this.amount = amount;
        this.paymentMode = paymentMode;
        this.bill = bill;
        this.referenceNumber = referenceNumber;
        this.paymentStatus = paymentStatus;
        this.paymentTime = paymentTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public LocalDateTime getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(LocalDateTime paymentTime) {
        this.paymentTime = paymentTime;
    }
}
