package com.shivam.learn.practiceQuestion.foodDelivery.notifactions;

public class PushNotifications implements Notification{

    @Override
    public void sendNotification(String pUserId, String msg) {
        System.out.println("The push Notification for the userId :"+ pUserId + " "+ msg);
    }
    
}
