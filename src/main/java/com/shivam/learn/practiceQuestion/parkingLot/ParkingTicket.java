package com.shivam.learn.practiceQuestion.parkingLot;

import java.time.LocalDateTime;

import com.shivam.learn.practiceQuestion.parkingLot.interfaces.ParkingSpot;

public class ParkingTicket {
    
    private long id;
    private ParkingSpot parkingSpot;
    private LocalDateTime issueTime;
    private int terminal;
    private String licenesePlate;
    private double amount;
    private boolean amountPaid;

    public boolean isAmountPaid() {
        return this.amountPaid;
    }

    public boolean getAmountPaid() {
        return this.amountPaid;
    }

    public void setAmountPaid(boolean amountPaid) {
        this.amountPaid = amountPaid;
    }

    public double getAmount() {
        return this.amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getTerminal() {
        return this.terminal;
    }

    public void setTerminal(int terminal) {
        this.terminal = terminal;
    }

    public String getLicenesePlate() {
        return this.licenesePlate;
    }

    public void setLicenesePlate(String licenesePlate) {
        this.licenesePlate = licenesePlate;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public ParkingSpot getParkingSpot() {
        return this.parkingSpot;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    public LocalDateTime getIssueTime() {
        return this.issueTime;
    }

    public void setIssueTime(LocalDateTime issueTime) {
        this.issueTime = issueTime;
    }

}
