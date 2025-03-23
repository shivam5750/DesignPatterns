package com.shivam.learn.practiceQuestion.foodDelivery;

import java.util.Map;

import com.shivam.learn.practiceQuestion.foodDelivery.Commons.Location;
import com.shivam.learn.practiceQuestion.foodDelivery.Commons.OrderStatus;
import com.shivam.learn.practiceQuestion.foodDelivery.foodManager.Dish;
import com.shivam.learn.practiceQuestion.foodDelivery.foodManager.Restaurant;

public class Order {
    
    private User user;
    private Restaurant restaurant;
    private Map<Dish, Integer> dishesh;
    private String discountCount;
    private OrderStatus orderStatus;
    private String paymentId;


    public Order(User user, Restaurant restaurant, Map<Dish,Integer> dishesh) {
        this.user = user;
        this.restaurant = restaurant;
        this.dishesh = dishesh;
        this.orderStatus = OrderStatus.PLACED;
    }


    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Restaurant getRestaurnat() {
        return this.restaurant;
    }

    public void setRestaurnat(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public String getRestaurnatId() {
        return this.restaurant.getName();
    }

    

    public Map<Dish,Integer> getDishesh() {
        return this.dishesh;
    }

    public void setDishesh(Map<Dish,Integer> dishesh) {
        this.dishesh = dishesh;
    }

    public String getDiscountCount() {
        return this.discountCount;
    }

    public void setDiscountCount(String discountCount) {
        this.discountCount = discountCount;
    }

    public OrderStatus getOrderStatus() {
        return this.orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getPaymentId() {
        return this.paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public Location getUserLocation() {
		return user.getLocation();
	}
	public Location getRestaurantLocation() {
		return restaurant.getLocation();
	}


}
