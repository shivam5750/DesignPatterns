package com.shivam.learn.practiceQuestion.foodDelivery.foodManager;

import java.util.ArrayList;
import java.util.List;

import com.shivam.learn.practiceQuestion.foodDelivery.Commons.Cuisines;

public class Dish {
 
    private String name;
    private String description;
    private double price;
    private List<AddOns> addOns =new ArrayList<>();
    private Cuisines cuisines;


    public Dish(String name, String description, double price, Cuisines cuisines) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.cuisines = cuisines;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<AddOns> getAddOns() {
        return this.addOns;
    }

    public void setAddOns(List<AddOns> addOns) {
        this.addOns = addOns;
    }

    public Cuisines getCuisines() {
        return this.cuisines;
    }

    public void setCuisines(Cuisines cuisines) {
        this.cuisines = cuisines;
    }

    public void addOns(AddOns addOn){
        this.addOns.add(addOn);
    }


    
}
