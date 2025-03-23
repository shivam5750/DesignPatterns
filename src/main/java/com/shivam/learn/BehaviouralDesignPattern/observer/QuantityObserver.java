package com.shivam.learn.BehaviouralDesignPattern.observer;

public class QuantityObserver implements OrderObserver {

    @Override
    public void updated(Order order) {
        double total = order.getTotal();
        if(total>=500){
            order.setShippingCost(60);
        }
        
    }
    
}
