package com.shivam.learn.practiceQuestion.parkingLot;

import java.time.Duration;
import java.time.LocalDateTime;

public class TarrifCalculator {
    
    public static double calculate(ParkingTicket ticket){
        Duration duration = Duration.between(ticket.getIssueTime(), LocalDateTime.now());
        long hours = duration.toHours();
        if(hours<=3){
            return ticket.getParkingSpot().getType().getPrice() +  300.0;
        }
        return  ticket.getParkingSpot().getType().getPrice() + 300.0 + (2* hours-2);
    }
}
