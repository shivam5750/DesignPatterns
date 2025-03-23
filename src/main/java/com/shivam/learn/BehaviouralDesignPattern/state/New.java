package com.shivam.learn.BehaviouralDesignPattern.state;

public class New implements OrderState {

    @Override
    public double handleState() {
        System.out.println("It's a new state! No processing charge going to be deducted");
        return 0;
    }
    
}
