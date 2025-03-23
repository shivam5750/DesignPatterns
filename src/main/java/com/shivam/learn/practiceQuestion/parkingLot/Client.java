package com.shivam.learn.practiceQuestion.parkingLot;

import com.shivam.learn.practiceQuestion.parkingLot.interfaces.ParkingType;

public class Client {
    public static void main(String[] args) throws Exception {
        System.out.println("PARKING LOT -----");

        // ParkingTicket ticket1= parkingLot.parkVehicle(ParkingType.MOTORCYCLE, 1);
        // ParkingTicket ticket2 = parkingLot.parkVehicle(ParkingType.LARGE, 2);
        // ParkingTicket ticket3 = parkingLot.parkVehicle(ParkingType.MOTORCYCLE, 3);
        // parkingLot.releaseParking(ticket3, new CashPayment());

        Thread thread1 = new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    ParkingLot parkingLot = ParkingLot.getInstance();
                    System.out.println("Thread Name : " + Thread.currentThread().getName());
                    ParkingTicket ticket1 = parkingLot.parkVehicle(ParkingType.MOTORCYCLE, 1);
                    ParkingTicket ticket2 = parkingLot.parkVehicle(ParkingType.LARGE, 2);
                    parkingLot.releaseParking(ticket2, new CashPayment());
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

            }
        });
        Thread thread2 = new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    // Wait for thread1 to finish before acquiring the lock
                    // thread1.join(); // This will make thread2 wait until thread1 completes
                    ParkingLot parkingLot = ParkingLot.getInstance();
                    System.out.println("Thread Name : " + Thread.currentThread().getName());
                    ParkingTicket ticket3 = parkingLot.parkVehicle(ParkingType.MOTORCYCLE, 3);
                    parkingLot.releaseParking(ticket3, new CashPayment());

                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

            }
        });
        // thread1.setPriority(2);
        thread1.start();
        thread2.start();

        // // Wait for thread1 to finish before continuing
        // try {
        // thread1.join(); // Main thread will wait for thread1 to finish
        // } catch (InterruptedException e) {
        // e.printStackTrace();
        // }

        // // Optionally, wait for thread2 to finish as well
        // try {
        // thread2.join(); // Main thread will wait for thread2 to finish
        // } catch (InterruptedException e) {
        // e.printStackTrace();
        // }
    }
}
