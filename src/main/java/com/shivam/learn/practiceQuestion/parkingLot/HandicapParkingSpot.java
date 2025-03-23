package com.shivam.learn.practiceQuestion.parkingLot;

import com.shivam.learn.practiceQuestion.parkingLot.interfaces.ParkingSpot;
import com.shivam.learn.practiceQuestion.parkingLot.interfaces.ParkingType;

public class HandicapParkingSpot extends ParkingSpot {

    public HandicapParkingSpot(int id, boolean available) {
        super(id, ParkingType.HANDICAP, available);
    }

    
    
}
