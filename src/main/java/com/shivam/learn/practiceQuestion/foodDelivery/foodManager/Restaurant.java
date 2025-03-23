package com.shivam.learn.practiceQuestion.foodDelivery.foodManager;

import java.util.Map;

import com.shivam.learn.practiceQuestion.foodDelivery.Commons.Location;
import com.shivam.learn.practiceQuestion.foodDelivery.notifactions.NotificationManager;

public class Restaurant {

    private Location location;
    private String name;	
	private boolean isAvail;
	private Menu menu;
	RestaurantOwner owner;
    NotificationManager notificationManager = NotificationManager.getInstance();


    public Restaurant(Location location, String name, RestaurantOwner owner) {
        this.location = location;
        this.name = name;
        this.isAvail = false;
        this.owner = owner;
    }


    public Location getLocation(){
        return this.location;
    }
    public void setLocation(Location location) {
        this.location = location;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isIsAvail() {
        return this.isAvail;
    }

    public boolean getIsAvail() {
        return this.isAvail;
    }

    public void setIsAvail(boolean isAvail) {
        this.isAvail = isAvail;
    }

    public Menu getMenu() {
        return this.menu;
    }

    public RestaurantOwner getOwner() {
        return this.owner;
    }

    public void setOwner(RestaurantOwner owner) {
        this.owner = owner;
    }

   
    


   
    public boolean prepareFood(String pRestaurantId, Map<Dish, Integer> pDishes, String pOrderId) throws InterruptedException{
        System.out.println("Restaurant accepting the order and starting to prepare it");

        notificationManager.notify(pOrderId, "Food is being prepared in restaurant");
        Thread.sleep(5000);
        notificationManager.notify(pOrderId, "Food is ready and can be picked up from restaurant");

        return true;
    }


    public void addMenu(Menu menu) {
        this.menu = menu;
    }
}
