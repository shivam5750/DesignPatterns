package com.shivam.learn.CreationalPattern.ObjectPoolDesignPattern;

import javafx.geometry.Point2D;

// Concrete Resuable
public class BitMap  implements Image{

    private Point2D location;

    private String name;

    public BitMap (String name){
        this.name = name;
    }

    @Override
    public void draw() {
        System.out.println("Drawing "+name + " @ "+ location);
    }

    @Override
    public Point2D getLocation() {
        return location;
    }

    @Override
    public void setLocation(Point2D location) {
        this.location = location;
    }

    @Override
    public void reset() {
       location = null;
       System.out.println("BitMap is reseted ");
    }
    
}
