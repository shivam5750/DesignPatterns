package com.shivam.learn.practiceQuestion.parkingLot.interfaces;

import java.util.Map;
import java.util.PriorityQueue;
import com.shivam.learn.practiceQuestion.parkingLot.ParkingLot.Pair;

public interface ParkignAssignmentStrategy {

    ParkingSpot getParkingSpot(int  terminal, Map<Integer,  PriorityQueue<Pair>> parkingSpace, ParkingType parkingType);
    boolean releaseParkingSpot(ParkingSpot parkingSpot);

    
} 