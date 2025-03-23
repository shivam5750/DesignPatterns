package com.shivam.learn.practiceQuestion.foodDelivery.deliveryManager;

public class LocationBasedDeliveryChargeCalculationStrategy implements DeliveryChargeCalculationStrategy {

    @Override
    public double calculateDeliveryCharge(DeliveryMetadata deliveryMetadata) {
        System.out.println("Keeping it simple and returning 50rs as the charge");
        return 50.00;
    }
    
}
