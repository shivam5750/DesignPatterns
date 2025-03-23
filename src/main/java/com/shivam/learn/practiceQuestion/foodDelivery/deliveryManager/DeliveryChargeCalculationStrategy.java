package com.shivam.learn.practiceQuestion.foodDelivery.deliveryManager;

public interface DeliveryChargeCalculationStrategy {
    
    double calculateDeliveryCharge(DeliveryMetadata deliveryMetadata);
}
