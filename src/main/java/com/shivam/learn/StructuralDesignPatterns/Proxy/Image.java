package com.shivam.learn.StructuralDesignPatterns.Proxy;

import javafx.geometry.Point2D;

// Interface implemented by proxy and concrete object
public interface Image {
    
    void setLocation(Point2D location);

    Point2D getLocation();

    void render();
}
