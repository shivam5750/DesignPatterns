package com.shivam.learn.practiceQuestion.parkingLot;

import com.shivam.learn.practiceQuestion.parkingLot.interfaces.ParkingSpot;
import com.shivam.learn.practiceQuestion.parkingLot.interfaces.ParkingType;

public class CompactParkingSpot extends ParkingSpot{

    public CompactParkingSpot(int id, boolean available) {
        super(id, ParkingType.COMPACT, available);
    }
    
}
