package com.shivam.learn.practiceQuestion.foodDelivery.deliveryManager;

import java.util.ArrayList;
import java.util.List;

public class LocationBasedDeliveryPartnerMatchingStrategy implements  DeliveryPartnerMatchingStrategy{

    @Override
    public List<DeliveryPartner> matchDeliveryPartner(DeliveryMetadata deliveryMetadata) {
       DeliveryPartnerManager deliveryPartnerManager = DeliveryPartnerManager.getInstance();

       System.out.println("\"Quadtrees can be used to get nearest delivery partners, \"<<\r\n" + //
               "\t\t\t\"Delivery partner manager can be used to get details of partners. \" <<\r\n" + //
               "\t\t\t\"Returning all delivery partners for demo purposes for now.\"");

        List<DeliveryPartner> nearestDeliveryPartner = new ArrayList<>();
        for(DeliveryPartner deliveryPartner : deliveryPartnerManager.getDeliveryPartnerMap().values()){
            nearestDeliveryPartner.add(deliveryPartner);
        }
        return nearestDeliveryPartner;
    }
    
}
