package com.shivam.learn.BehaviouralDesignPattern.state;

public class Client {
    
    public static void main(String[] args) {
        
        Order order = new Order();
        order.paymentSuccessful();
        order.dispatched();
        order.delivered();
        order.cancel();
        
    }
}
