package com.shivam.learn.practiceQuestion.foodDelivery.Commons;

public class Location {
    
    private double longitude;
    private double latitude;

    public Location(int x, int y){
        this.longitude = x;
        this.latitude = y;
    }



    public double getLongitude() {
        return this.longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return this.latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
   
}
