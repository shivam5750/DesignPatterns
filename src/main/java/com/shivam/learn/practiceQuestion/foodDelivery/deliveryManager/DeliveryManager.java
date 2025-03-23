package com.shivam.learn.practiceQuestion.foodDelivery.deliveryManager;

import java.util.List;

import com.shivam.learn.practiceQuestion.foodDelivery.OrderManagerI;
import com.shivam.learn.practiceQuestion.foodDelivery.notifactions.NotificationManager;
import com.shivam.learn.practiceQuestion.foodDelivery.notifactions.PushNotifications;

public class DeliveryManager {

    private static volatile DeliveryManager INSTANCE;

    public static DeliveryManager getInstance() {
        if (INSTANCE == null) {
            synchronized (OrderManagerI.class) {
                if (INSTANCE == null) {
                    INSTANCE = new DeliveryManager();
                }
            }
        }
        return INSTANCE;
    }

    public void manageDelivery(String orderId, DeliveryMetadata deliveryMetaData) throws InterruptedException {
        
        DeliveryPartnerMatchingStrategy partnerMatchingStrategy = new LocationBasedDeliveryPartnerMatchingStrategy();
    
        List<DeliveryPartner> deliverypartners = partnerMatchingStrategy.matchDeliveryPartner(deliveryMetaData);
    
        NotificationManager notificationMgr = NotificationManager.getInstance();
        //Send push notifications to the nearest delivery partners
        for (DeliveryPartner deliveryPartner : deliverypartners) {
            notificationMgr.notifyParticularUser(deliveryPartner.getName(), "Delivery Request", new PushNotifications());
        }
    
        DeliveryPartner assignedDeliveryPartner = deliverypartners.get(0);
    
        //Assume first delivery partner accepted it
        notificationMgr.notify(orderId, "Delivery Partner " + assignedDeliveryPartner.getName() + " assigned for the order " + orderId);
    
    
        assignedDeliveryPartner.performDelivery(orderId, deliveryMetaData);
    }
}
