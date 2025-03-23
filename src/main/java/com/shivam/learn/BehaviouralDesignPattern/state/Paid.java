package com.shivam.learn.BehaviouralDesignPattern.state;

public class Paid implements OrderState {

    @Override
    public double handleState() {
        System.out.println("Contacting payment gateyway to rollback the transaction");
        return 10;
    }
    
}
