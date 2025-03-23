package com.shivam.learn.BehaviouralDesignPattern.observer;

public class Client {
    
    public static void main(String[] args) {
        Order order = new Order("100");
        
        OrderObserver priceObsercer = new PriceObserver();
        OrderObserver quqantityObserver = new QuantityObserver();
        order.attach(priceObsercer);
        order.attach(quqantityObserver);
        order.addItem(600);
        System.out.println(order);
    }
}
