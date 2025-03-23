package com.shivam.learn.practiceQuestion.parkingLot;

import com.shivam.learn.practiceQuestion.parkingLot.interfaces.ParkingSpot;
import com.shivam.learn.practiceQuestion.parkingLot.interfaces.ParkingType;

public class MotorCycleParkingSpot extends ParkingSpot {

    public MotorCycleParkingSpot(int id,  boolean available) {
        super(id, ParkingType.MOTORCYCLE, available);
    }

    
}
