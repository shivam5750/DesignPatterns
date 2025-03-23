package com.shivam.learn.practiceQuestion.foodDelivery.deliveryManager;

import com.shivam.learn.practiceQuestion.foodDelivery.Commons.Location;

//This class basically has all the info that will be used by strategy 
//Even if more data is needed, only this class needs to be updated
//Suppose strategy is different for premium customer then only one bool can be added here
//The bool here can determine if customer is premium ot not, all customer info need not be passed
public class DeliveryMetadata {
    
    private Location userLoc;
	private Location restaurantLoc;
	private String orderId;


    public DeliveryMetadata(Location userLoc, Location restaurantLoc, String orderId) {
        this.userLoc = userLoc;
        this.restaurantLoc = restaurantLoc;
        this.orderId = orderId;
    }


    public Location getUserLoc() {
        return this.userLoc;
    }

    public void setUserLoc(Location userLoc) {
        this.userLoc = userLoc;
    }

    public Location getRestaurantLoc() {
        return this.restaurantLoc;
    }

    public void setRestaurantLoc(Location restaurantLoc) {
        this.restaurantLoc = restaurantLoc;
    }

    public String getOrderId() {
        return this.orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }


}
