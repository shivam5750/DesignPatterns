package com.shivam.learn.BehaviouralDesignPattern.templateMethod;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Order {
    
    private String id; 
    private LocalDate date;
    private Map<String, Double> items = new HashMap<>();
    private double total;


    public Order(String id){
        this.id = id;
        this.date = LocalDate.now();
    }
    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return this.date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Map<String,Double> getItems() {
        return this.items;
    }

    public void addItem(String product, double price) {
        items.put(product, price);
    }

    public double getTotal() {
        return items.values().stream().mapToDouble(Double :: doubleValue).sum();
    }

    
}
