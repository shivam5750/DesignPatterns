package com.shivam.learn.practiceQuestion.foodDelivery.deliveryManager;

import com.shivam.learn.practiceQuestion.foodDelivery.IPartner;
import com.shivam.learn.practiceQuestion.foodDelivery.Order;
import com.shivam.learn.practiceQuestion.foodDelivery.OrderManager;
import com.shivam.learn.practiceQuestion.foodDelivery.Commons.OrderStatus;
import com.shivam.learn.practiceQuestion.foodDelivery.notifactions.NotificationManager;
import com.shivam.learn.practiceQuestion.foodDelivery.notifactions.PushNotifications;

public class DeliveryPartner extends IPartner{

    public DeliveryPartner(String name) {
        super(name);
    }

    //Order Status also needs to be updated while these steps are happening
	void performDelivery(String orderId, DeliveryMetadata deliveryMetaData) throws InterruptedException {
		NotificationManager notificationMgr = NotificationManager.getInstance();
		System.out.println(name);
		double restaurantLocLatitude = deliveryMetaData.getRestaurantLoc().getLatitude();
		double restaurantLocLongitude = deliveryMetaData.getRestaurantLoc().getLongitude();
        Order order = OrderManager.getOderManagerInstance().getOrder(orderId);

        

		notificationMgr.notify(orderId, name + " going to pick up delivery from location " 
						+restaurantLocLatitude+ "," + restaurantLocLongitude);

		Thread.sleep(5000);

		notificationMgr.removeNotificationsSender(orderId, order.getRestaurnatId(), new PushNotifications());


		notificationMgr.notify(orderId, name + " picked up delivery!");

		Thread.sleep(5000);

		notificationMgr.notify(orderId, name + " on the way to deliver!");

        order.setOrderStatus(OrderStatus.ON_THE_WAY);

		Thread.sleep(5000);
       
		double userLocLatitude = deliveryMetaData.getUserLoc().getLatitude();
		double userLocLongitude = deliveryMetaData.getUserLoc().getLongitude();
		notificationMgr.notify(orderId, name + " reached the location " + userLocLatitude + "," + userLocLongitude);
		
        order.setOrderStatus(OrderStatus.REACHED);
		
        Thread.sleep(5000);

        order.setOrderStatus(OrderStatus.DELIVERED);

		notificationMgr.notify(orderId, name + " delivered the order. CONGRATULATIONS!!");
    }


    
    
    
}
