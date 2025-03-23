package com.shivam.learn.StructuralDesignPatterns.Proxy;

import javafx.geometry.Point2D;

public class Client {
    
    public static void main(String[] args) {
        Image img = ImageFactory.getImage("Style.png");
        img.setLocation(new Point2D(10, -20));
        System.out.println(img.getLocation());
        System.out.println("Rendering Image-------");
        System.out.println("render");
        img.render();
    }
}
