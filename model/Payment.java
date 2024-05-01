package model;

import model.constant.PaymentMode;
import model.constant.PaymentStatus;

import java.time.LocalDateTime;

public class Payment {
    private int id;
    private double amount;
    private PaymentMode paymentMode;
    private Bill bill;
    private int referenceNumber;
    private PaymentStatus paymentStatus;
    private LocalDateTime time;
}
