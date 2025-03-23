package com.shivam.learn.practiceQuestion.parkingLot;

import com.shivam.learn.practiceQuestion.parkingLot.interfaces.PaymentProcess;

public class CreditCardPayment implements PaymentProcess {

    @Override
    public boolean ProcessPayment(double amount) {
       System.out.println("Payment made through creditCard amount: "+ amount);
       return true;
    }
    
}
