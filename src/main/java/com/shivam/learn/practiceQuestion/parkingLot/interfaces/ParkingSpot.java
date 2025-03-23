package com.shivam.learn.practiceQuestion.parkingLot.interfaces;

public abstract class ParkingSpot {
    
    private int id;
    private ParkingType type;
    private boolean available;

    public ParkingSpot(int id, ParkingType type, boolean available) {
        this.id = id;
        this.type = type;
        this.available = available;
    }


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ParkingType getType() {
        return this.type;
    }

    public void setType(ParkingType type) {
        this.type = type;
    }

    public boolean isAvailable() {
        return this.available;
    }

    public boolean getAvailable() {
        return this.available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
   
}
