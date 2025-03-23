package com.shivam.learn.practiceQuestion.foodDelivery;

import java.util.HashMap;
import java.util.Map;

import com.shivam.learn.practiceQuestion.foodDelivery.deliveryManager.DeliveryManager;
import com.shivam.learn.practiceQuestion.foodDelivery.deliveryManager.DeliveryMetadata;
import com.shivam.learn.practiceQuestion.foodDelivery.foodManager.FoodManager;
import com.shivam.learn.practiceQuestion.foodDelivery.notifactions.NotificationManager;
import com.shivam.learn.practiceQuestion.foodDelivery.notifactions.SmsNotificationSender;

public class OrderManager implements OrderManagerI {

    private Map<String, Order> orderMap;
    private static volatile OrderManagerI orderManagerIstance;
    private DeliveryManager deliveryManager;
    private FoodManager foodManager;
    private NotificationManager notificationManager;

    private OrderManager() {
        orderMap = new HashMap<>();
        notificationManager = NotificationManager.getInstance();
        deliveryManager = DeliveryManager.getInstance();
    }

    public static OrderManagerI getOderManagerInstance() {
        if (orderManagerIstance == null) {
            synchronized (OrderManagerI.class) {
                if (orderManagerIstance == null) {
                    orderManagerIstance = new OrderManager();
                }
            }
        }
        return orderManagerIstance;
    }

    @Override
    public void createOrder(String orderId, Order order) {
        orderMap.put(orderId, order);
        
        addUserForNotificationUpdates(orderId);
        
        manageFood(orderId);
        
        manageDelivery(orderId);
    }

    @Override
    public Order getOrder(String orderId) {
        return orderMap.get(orderId);
    }

    @Override
    public void addUserForNotificationUpdates(String pOrderId) {
        notificationManager.addNotificationSender(pOrderId, orderMap.get(pOrderId).getUser().getUserId(),
                new SmsNotificationSender());
    }

    @Override
    public void manageDelivery(String orderId) {
        DeliveryMetadata metaData = new DeliveryMetadata(getOrder(orderId).getUserLocation(), getOrder(orderId).getRestaurantLocation(),  orderId);
	    try {
            deliveryManager.manageDelivery(orderId, metaData);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void manageFood(String orderId) {
        foodManager = FoodManager.getInstance();
        Order order = orderMap.get(orderId);
       
        try {
            foodManager.prepareFood(orderId, order.getRestaurnatId(), order.getDishesh());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public Order getOrderMap(String orderId) {
        return orderMap.get(orderId);
    }

}
