package com.shivam.learn.BehaviouralDesignPattern.state;

public class Delivered implements OrderState{

    @Override
    public double handleState() {
       System.out.println("Contacting courier service for item pickup");
       System.out.println("Payment rollback will be initiated upon receiving the return item");
       return 30;
    }
    
}
