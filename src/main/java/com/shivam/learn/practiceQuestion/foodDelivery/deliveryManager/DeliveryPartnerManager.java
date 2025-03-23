package com.shivam.learn.practiceQuestion.foodDelivery.deliveryManager;

import java.util.HashMap;
import java.util.Map;

import com.shivam.learn.practiceQuestion.foodDelivery.OrderManagerI;

public class DeliveryPartnerManager {
    private static volatile DeliveryPartnerManager INSTANCE;
    private Map<String, DeliveryPartner> deliveryPartnerMap;

    private DeliveryPartnerManager(){
        deliveryPartnerMap = new HashMap<>();
    }

    public static DeliveryPartnerManager getInstance() {
        if (INSTANCE == null) {
            synchronized (OrderManagerI.class) {
                if (INSTANCE == null) {
                    INSTANCE = new DeliveryPartnerManager();
                }
            }
        }
        return INSTANCE;
    }

    public void addDeliveryPartner(String deliveryPartnerName, DeliveryPartner deliveryPartner){
        deliveryPartnerMap.put(deliveryPartnerName, deliveryPartner);
    }

    public DeliveryPartner getDeliveryPartner(String deliveryPartnerName){
        return this.deliveryPartnerMap.get(deliveryPartnerName);
     }

    public Map<String, DeliveryPartner> getDeliveryPartnerMap(){
       return this.deliveryPartnerMap;
    }

}
