package com.shivam.learn.practiceQuestion.foodDelivery.deliveryManager;

import java.util.List;

public interface DeliveryPartnerMatchingStrategy {
    
    List<DeliveryPartner> matchDeliveryPartner(DeliveryMetadata deliveryMetadata);
}
