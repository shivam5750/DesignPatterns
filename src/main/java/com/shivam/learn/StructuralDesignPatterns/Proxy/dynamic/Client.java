package com.shivam.learn.StructuralDesignPatterns.Proxy.dynamic;

import com.shivam.learn.StructuralDesignPatterns.Proxy.Image;

import javafx.geometry.Point2D;

public class Client {
    
    public static void main(String[] args) {
        Image img = ImageFactory.getImage("xyz.png");
        img.setLocation(new Point2D(10, -10));
    }
}
