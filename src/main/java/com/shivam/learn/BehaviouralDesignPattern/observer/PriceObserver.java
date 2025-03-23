package com.shivam.learn.BehaviouralDesignPattern.observer;

public class PriceObserver implements OrderObserver {

    @Override
    public void updated(Order order) {
        double total = order.getItemCost();
        if(total >= 500){
            order.setDiscoun(20);
        }else if(total >= 200){
            order.setDiscoun(10);
        }
    }
    
}
