package com.shivam.learn.practiceQuestion.parkingLot;

import com.shivam.learn.practiceQuestion.parkingLot.interfaces.PaymentProcess;

public class CashPayment implements PaymentProcess{

    @Override
    public boolean ProcessPayment(double amount) {
       System.out.println("Payment made through cash amount: "+ amount);
       return true;
    }
}
