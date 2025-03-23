package com.shivam.learn.practiceQuestion.foodDelivery;

public interface OrderManagerI {
    
    void createOrder(String orderId, Order order);
    void manageDelivery(String orderId);
    void manageFood(String orderId);
    Order getOrder(String orderId);
    void addUserForNotificationUpdates(String pOrderId);

}
