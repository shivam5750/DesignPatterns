package com.shivam.learn.BehaviouralDesignPattern.observer;

import java.util.ArrayList;
import java.util.List;

// Concrete Subject
public class Order {

    // count of items
    private int count;
    private String id;
    // cost of item
    private double itemCost;

    private double discount;

    private double shippingCost =100;

    private List<OrderObserver> observerList = new ArrayList<>();
    
    public void attach(OrderObserver observer){
        observerList.add(observer);
    }

    public void dettach(OrderObserver observer){
        observerList.remove(observer);
    }

    public Order(String id){
        this.id = id;
    }

    public double getTotal(){
        return itemCost -discount + shippingCost;
    }
    public double getItemCost(){
        return this.itemCost;
    }

    public void addItem(double price){
        itemCost += price;
        count++;
        observerList.forEach(o -> o.updated(this));
    }

    public int getCount(){
        return count;
    }

    public double getDiscount(){
        return this.discount;
    }

    public void setDiscoun(double discount){
        this.discount = discount;
    }

    public double getShippingCost(){
        return this.shippingCost;
    }

    public void setShippingCost(double shippingCost){
        this.shippingCost = shippingCost;
    }


    @Override
    public String toString() {
        return "{" +
            " count='" + getCount() + "'" +
            ", itemCost='" + getItemCost() + "'" +
            ", discount='" + getDiscount() + "'" +
            ", shippingCost='" + getShippingCost() + "'" +
            "}";
    }


}
