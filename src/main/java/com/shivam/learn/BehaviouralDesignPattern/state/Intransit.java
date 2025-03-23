package com.shivam.learn.BehaviouralDesignPattern.state;

public class Intransit implements OrderState {

    @Override
    public double handleState() {
       System.out.println("Contacting courier service for cancellation");
       System.out.println("Contacting payment gatewat for transaction rollback");
       return 20;
    }
    
}
