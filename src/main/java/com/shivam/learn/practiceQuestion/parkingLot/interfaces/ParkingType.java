package com.shivam.learn.practiceQuestion.parkingLot.interfaces;

public enum ParkingType {
    
    HANDICAP(30),
    MOTORCYCLE(50),
    COMPACT(80),
    LARGE(100);

    private int price;
    ParkingType(int price) {
        this.price = price;
    }

    

    public int getPrice() {
        return price;
    }

}
