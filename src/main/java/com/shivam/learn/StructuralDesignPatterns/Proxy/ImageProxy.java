package com.shivam.learn.StructuralDesignPatterns.Proxy;

import javafx.geometry.Point2D;

public class ImageProxy implements Image {

    private Image bitmapImage;
    private String name;
    private Point2D location;

    public ImageProxy(String fileName) {
        this.name = fileName;
    }

    @Override
    public void setLocation(Point2D location) {
        if(bitmapImage != null){
            bitmapImage.setLocation(location);
        } else{
            this.location = location; 
        }
    }

    @Override
    public Point2D getLocation() {
        if(bitmapImage != null){
            return bitmapImage.getLocation();
        } 
        return location;
    }

    @Override
    public void render() {
        if(bitmapImage == null) {
            bitmapImage = new BitmapImage(this.name);
            if(location != null){
                bitmapImage.setLocation(this.location);
            }

        }
        bitmapImage.render();
    }
    
}
