package com.shivam.learn.CreationalPattern.ObjectPoolDesignPattern;

import javafx.geometry.Point2D;

// Represnt the abstract resuable
public interface Image extends Poolable{

    void draw();

    Point2D getLocation();

    void setLocation(Point2D location);
} 
    
    
