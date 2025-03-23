package com.shivam.learn.practiceQuestion.parkingLot;

import com.shivam.learn.practiceQuestion.parkingLot.interfaces.Terminal;

public class ExitTerminal implements Terminal {
    
    public boolean acceptTicket(ParkingTicket ticket){
        return true;
    }
}
