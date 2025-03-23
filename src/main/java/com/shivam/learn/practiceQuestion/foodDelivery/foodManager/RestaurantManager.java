package com.shivam.learn.practiceQuestion.foodDelivery.foodManager;

import java.util.HashMap;
import java.util.Map;

import com.shivam.learn.practiceQuestion.foodDelivery.OrderManagerI;

public class RestaurantManager {
    
    private static volatile RestaurantManager INSTANCE;
    private Map<String, Restaurant> restaurantMap;

    private RestaurantManager(){
        restaurantMap = new HashMap<>();
    }

    public static RestaurantManager getInstance() {
        if (INSTANCE == null) {
            synchronized (OrderManagerI.class) {
                if (INSTANCE == null) {
                    INSTANCE = new RestaurantManager();
                }
            }
        }
        return INSTANCE;
    }

    public Restaurant getRestaurant(String pRestaurantId) {
        System.out.println(restaurantMap.get(pRestaurantId));
       return restaurantMap.get(pRestaurantId);
    }
    
    public void addRestaurant(String pRestaurantId, Restaurant restaurant){
        restaurantMap.put(pRestaurantId, restaurant);
    }
}
