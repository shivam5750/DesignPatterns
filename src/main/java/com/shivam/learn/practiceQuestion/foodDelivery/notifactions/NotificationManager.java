package com.shivam.learn.practiceQuestion.foodDelivery.notifactions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.shivam.learn.practiceQuestion.foodDelivery.Commons.Pair;



public class NotificationManager {
    
    private static volatile NotificationManager notificationManager;
    private Map<String, List<Pair<String, Notification>>> notificationSendersMap;
    
    private NotificationManager(){
        notificationSendersMap = new HashMap<>();
    }

    public static NotificationManager getInstance(){
        if(notificationManager == null){
            synchronized(NotificationManager.class){
                if(notificationManager == null){
                    notificationManager = new NotificationManager();
                }
            }
        }
        return notificationManager;
    }

    //register observer
    @SuppressWarnings("rawtypes")
    public void addNotificationSender(String pOrderId, String pUserId, Notification pushNotificationSender) {
        List<Pair<String, Notification>> notificationSenders = notificationSendersMap.getOrDefault(pOrderId, new ArrayList<>());
    
    // Check if the sender is already present in the list
    boolean senderExists = notificationSenders.stream()
                           .anyMatch(pair -> pair.first.equals(pUserId) && pair.second == pushNotificationSender);
    
    if (!senderExists) {
        // Add the new sender to the list
        Pair<String, Notification> pair = new Pair(pUserId, pushNotificationSender);
        notificationSenders.add(pair);
        notificationSendersMap.put(pOrderId, notificationSenders);
    }
    }

     //remove observer
     public void removeNotificationsSender(String pOrderId, String pUserId, Notification pNotificationSender) {

        List<Pair<String, Notification>> notificationSenders = notificationSendersMap.getOrDefault(pOrderId, new ArrayList<>());
        // Find the index of the sender in the list
    int senderIndex = -1;
    for (int i = 0; i < notificationSenders.size(); i++) {
        Pair<String, Notification> pair = notificationSenders.get(i);
        if (pair.first.equals(pUserId) && pair.second.getClass()== pNotificationSender.getClass()) {
            senderIndex = i;
            break;
        }
    }
    
    // Remove the sender from the list if found
    if (senderIndex != -1) {
        notificationSenders.remove(senderIndex);
        notificationSendersMap.put(pOrderId, notificationSenders);
    }

    
    }

    //notify Observers
	public void notify(String pOrderId, String msg) {
        // System.out.println("OrderId :" + pOrderId +" "+notificationSendersMap.get(pOrderId));
		for (Pair<String, Notification> pair : notificationSendersMap.get(pOrderId)){
            pair.second.sendNotification(pair.first, msg);

        }
			
	}

	//notify particular user by a particular method
	public void notifyParticularUser(String pUserId, String msg, Notification sender) {
		sender.sendNotification(pUserId, msg);
	}
}
