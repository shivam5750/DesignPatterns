package com.shivam.learn.BehaviouralDesignPattern.state;

public class Cancelled implements OrderState{

    @Override
    public double handleState() {
        throw new IllegalStateException();
    }
    
}
