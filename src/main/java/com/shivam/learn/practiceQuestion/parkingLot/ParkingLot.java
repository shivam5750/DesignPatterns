package com.shivam.learn.practiceQuestion.parkingLot;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

import com.shivam.learn.practiceQuestion.parkingLot.interfaces.ParkignAssignmentStrategy;
import com.shivam.learn.practiceQuestion.parkingLot.interfaces.ParkingSpot;
import com.shivam.learn.practiceQuestion.parkingLot.interfaces.ParkingType;
import com.shivam.learn.practiceQuestion.parkingLot.interfaces.PaymentProcess;


public class ParkingLot {

    private ParkignAssignmentStrategy parkStrategy = new ParkingNearEntranceStrategy(); 
    private Map<Integer,  PriorityQueue<Pair>> parkingSpace = new HashMap<>();
    
    public class Pair{
        public ParkingSpot parkingSpot;
        public Float dist;
        Pair(ParkingSpot parkingSpot, float dist){
            this.parkingSpot = parkingSpot;
            this.dist = dist;
        }
    }
    
    private static ParkingLot INSTANCE;

    private ParkingLot() {
        System.out.println("Constructor");
       configuration();
    }


    public static ParkingLot getInstance(){
        if(INSTANCE == null){
            synchronized(ParkingLot.class){
                if(INSTANCE == null){
                    INSTANCE = new ParkingLot();
                }
            }
        }
        return INSTANCE;
    }

    public synchronized  ParkingTicket  parkVehicle(ParkingType parkingType, int terminal) throws Exception{
        
        ParkingSpot parkingSpot = parkStrategy.getParkingSpot(terminal, parkingSpace,  parkingType);
        if(parkingSpot == null){
            throw new RuntimeException("Parking Not Available");
        }
        ParkingTicket parkingTicket = new ParkingTicket();
        parkingTicket.setId(parkingSpot.getId());
        parkingTicket.setIssueTime(LocalDateTime.now());
        parkingTicket.setLicenesePlate("License number");
        parkingTicket.setTerminal(terminal);
        parkingTicket.setParkingSpot(parkingSpot);
    
        System.out.println("***TICKET GENERATED***");
        System.out.println("ID :" + parkingTicket.getId());
        System.out.print("ID : "+ parkingTicket.getParkingSpot().getId()  + " "+ "PARKINGSPOT :"  + parkingTicket.getParkingSpot().getType() + " "+ "Available : " +  parkingTicket.getParkingSpot().getAvailable());
        System.out.println("");
        System.out.println("ISSUETIME : "+ parkingTicket.getIssueTime());
        return parkingTicket;
    }

    public synchronized  boolean releaseParking(ParkingTicket parkingTicket, PaymentProcess paymentProcess){
        parkingTicket.getParkingSpot().setAvailable(true);
        double amt = TarrifCalculator.calculate(parkingTicket);
        parkingTicket.setAmount(amt);
        if( paymentProcess.ProcessPayment(amt)){
            parkingTicket.setAmountPaid(true);
            return true;
        }
        return false;
    }
    private void configuration(){
        
        Set<Float> distset = new HashSet<>();
        for(int i=1; i<=4; i++){
            parkingSpace.put(i, new PriorityQueue<Pair>((x,y) ->Float.compare(x.dist, y.dist)));
        } 
        // Parking sapce for motorcycle total : 30
        for(int i=1; i<=30;){
            int rand = (int)(Math.random() * 4) + 1;
            Float dis = (float) ((Math.random()*100)+1);
           
            if(!distset.contains(dis)){
                parkingSpace.get(rand).add(new Pair(new MotorCycleParkingSpot(i, true), dis));
                distset.add(dis);
                i++;
            }
           
        }

         // Parking sapce for compact total : 25
         for(int i=1; i<=25;){
            int rand = (int)(Math.random() * 4) + 1;
            Float dis = (float) ((Math.random()*100)+1);
           
            if(!distset.contains(dis)){
                parkingSpace.get(rand).add(new Pair(new CompactParkingSpot(i+30, true), dis));
                distset.add(dis);
                i++;
            }
           
        }

         // Parking sapce for large total : 15
         for(int i=1; i<=15;){
            int rand = (int)(Math.random() * 4) + 1;
            Float dis = (float) ((Math.random()*100)+1);
           
            if(!distset.contains(dis)){
                parkingSpace.get(rand).add(new Pair(new LargeParkingSpot(i+55, true), dis));
                distset.add(dis);
                i++;
            }
           
        }
        
        // parkingSpace.forEach((k, v)-> {
        //     System.out.println("ENTRANCE: " +k);
        //     for(Pair p: v){
        //         System.out.println(p.parkingSpot.getType() + "   "+ p.dist);
        //     }
        // });

        for(int i=1; i<=4; i++){
            for(Pair p : parkingSpace.get(i)){
                if(p.parkingSpot.getType() == ParkingType.MOTORCYCLE){
                    System.out.println(i + "Motorcycle");
                }
                if(p.parkingSpot.getType() == ParkingType.COMPACT){
                    System.out.println(i + "compact");
                }
                if(p.parkingSpot.getType() == ParkingType.LARGE){
                    System.out.println(i + "large");
                }
            }
        }
        
        

    }
}
