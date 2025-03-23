package com.shivam.learn.practiceQuestion.parkingLot;

import java.util.Map;
import java.util.PriorityQueue;

import com.shivam.learn.practiceQuestion.parkingLot.ParkingLot.Pair;
import com.shivam.learn.practiceQuestion.parkingLot.interfaces.ParkignAssignmentStrategy;
import com.shivam.learn.practiceQuestion.parkingLot.interfaces.ParkingSpot;
import com.shivam.learn.practiceQuestion.parkingLot.interfaces.ParkingType;

public class ParkingNearEntranceStrategy implements ParkignAssignmentStrategy{

    @Override
    public ParkingSpot getParkingSpot(int terminal, Map<Integer,  PriorityQueue<Pair>> parkingSpace, ParkingType parkingType) {
        
        System.out.println("_____________________");
        PriorityQueue<Pair> pq = parkingSpace.get(terminal);
        ParkingSpot parkingSpot = null;
        int idx =terminal;
        terminal++;
        // System.out.println(terminal%4 != idx && parkingSpot == null);
        while(terminal%4 != idx && parkingSpot == null){
            // System.out.println("_____________________");
            Pair pair = pq.stream().filter(p -> {
                return p.parkingSpot.getType().equals(parkingType) &&  p.parkingSpot.isAvailable();
            }).findFirst().get();
            parkingSpot = pair.parkingSpot;

            // System.out.println("parkingspot fetched" + parkingSpot);
            if(parkingSpot != null){
                System.out.println("Terminal : " + --terminal + " "+ "Distane : "+ pair.dist);
                // System.out.println(" ");
            }
            pq = parkingSpace.get(terminal);
            terminal++;
        }
        parkingSpot.setAvailable(false);
        return parkingSpot;
    }

    @Override
    public boolean releaseParkingSpot(ParkingSpot parkingSpot) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'releaseParkingSpot'");
    }
    
}
