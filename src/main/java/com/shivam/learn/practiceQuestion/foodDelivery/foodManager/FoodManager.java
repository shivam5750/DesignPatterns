package com.shivam.learn.practiceQuestion.foodDelivery.foodManager;

import java.util.Map;

import com.shivam.learn.practiceQuestion.foodDelivery.Order;
import com.shivam.learn.practiceQuestion.foodDelivery.OrderManager;
import com.shivam.learn.practiceQuestion.foodDelivery.OrderManagerI;
import com.shivam.learn.practiceQuestion.foodDelivery.Commons.OrderStatus;
import com.shivam.learn.practiceQuestion.foodDelivery.notifactions.NotificationManager;
import com.shivam.learn.practiceQuestion.foodDelivery.notifactions.PushNotifications;

public class FoodManager {
    
    private static volatile FoodManager INSTANCE;
    private NotificationManager notificationManager;
    private RestaurantManager restaurantMgr;
    
    private FoodManager(){
        notificationManager = NotificationManager.getInstance();
        restaurantMgr = RestaurantManager.getInstance();
    }

    public static FoodManager getInstance() {
        if (INSTANCE == null) {
            synchronized (OrderManagerI.class) {
                if (INSTANCE == null) {
                    INSTANCE = new FoodManager();
                }
            }
        }
        return INSTANCE;
    }

    void addRestaurantForNotificationUpdates(String pOrderId, String pRestaurantId) {
        //we can add push or whatsapp notifications in same way. Basically, we are keeping all notifications customisable
        notificationManager.addNotificationSender(pOrderId, pRestaurantId, new PushNotifications());
    }

    public void prepareFood(String pOrderId, String pRestaurantId, Map<Dish, Integer> pDishes) throws InterruptedException {
        Order order = OrderManager.getOderManagerInstance().getOrder(pOrderId);

        order.setOrderStatus(OrderStatus.PLACED);
        
        Restaurant restaurant = restaurantMgr.getRestaurant(pRestaurantId);
        // System.out.println(restaurant.getName());
        restaurant.prepareFood(pRestaurantId, pDishes, pOrderId);

        order.setOrderStatus(OrderStatus.ACCEPTED);
        
    
        //Restaurant should receive the delivery partner's notifications. 
        //The order in which the restaurant, user & delivery partner are added to the notification mgr
        //will decide which notifications they receive
        //For interviews, This is too much detailing though, we can just mention to interviewer and move forward
        addRestaurantForNotificationUpdates(pOrderId, pRestaurantId);
        // addRestaurantForNotificationUpdates(pRestaurantId, pOrderId);
    }

}
