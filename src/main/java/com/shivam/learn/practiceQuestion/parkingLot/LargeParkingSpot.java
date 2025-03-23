package com.shivam.learn.practiceQuestion.parkingLot;

import com.shivam.learn.practiceQuestion.parkingLot.interfaces.ParkingSpot;
import com.shivam.learn.practiceQuestion.parkingLot.interfaces.ParkingType;

public class LargeParkingSpot extends ParkingSpot{

    public LargeParkingSpot(int id, boolean available) {
        super(id, ParkingType.LARGE, available);
    }

    
    
}
