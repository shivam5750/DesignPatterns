package com.shivam.learn.practiceQuestion.foodDelivery.notifactions;

public class SmsNotificationSender implements Notification {

    @Override
    public void sendNotification(String pUserId, String msg) {
        System.out.println("The SMS Notification for the userId :"+ pUserId + " "+ msg);
    }
    
}
