package com.shivam.learn.practiceQuestion.parkingLot;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

import com.shivam.learn.practiceQuestion.parkingLot.ParkingLot.Pair;
import com.shivam.learn.practiceQuestion.parkingLot.interfaces.ParkingSpot;
import com.shivam.learn.practiceQuestion.parkingLot.interfaces.ParkingType;
import com.shivam.learn.practiceQuestion.parkingLot.interfaces.PaymentProcess;

public class SynchronizedBlockParking {
     private final Object lock = new Object();
    private Map<Integer, PriorityQueue<Pair>> parkingSpace = new HashMap<>();

    // Method to check if parking is available
    public boolean isParkingAvailable(ParkingType parkingType, int terminal) {
        // Implement logic to check if there is an available parking spot
        // This is a placeholder; you should replace it with your actual logic
        return parkingSpace.containsKey(terminal) && !parkingSpace.get(terminal).isEmpty();
    }

    public ParkingTicket parkVehicle(ParkingType parkingType, int terminal) throws Exception {
        synchronized (lock) {
            // Wait until parking is available
            while (!isParkingAvailable(parkingType, terminal)) {
                lock.wait(); // Wait until notified that parking is available
            }

            // Logic to park the vehicle
            ParkingSpot parkingSpot = getAvailableParkingSpot(parkingType, terminal);
            if (parkingSpot == null) {
                throw new RuntimeException("No available parking spot found.");
            }

            // Create and return a parking ticket
            ParkingTicket ticket = new ParkingTicket();
            ticket.setParkingSpot(parkingSpot);
            // Additional ticket setup...
            
            // Notify other threads that parking is available
            lock.notifyAll(); // Notify waiting threads that parking is available
            return ticket;
        }
    }

    public void releaseParking(ParkingTicket parkingTicket, PaymentProcess paymentProcess) {
        synchronized (lock) {
            // Logic to release the parking spot
            parkingTicket.getParkingSpot().setAvailable(true);
            // Notify waiting threads that parking is available
            lock.notifyAll(); // Notify waiting threads that parking is available
        }
    }

    private ParkingSpot getAvailableParkingSpot(ParkingType parkingType, int terminal) {
        // Implement logic to find an available parking spot based on type and terminal
        // This is a placeholder; you should replace it with your actual logic
        return null; // Replace with actual parking spot retrieval logic
    }
}
