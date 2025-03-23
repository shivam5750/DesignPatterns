package com.shivam.learn.practiceQuestion.foodDelivery;

import java.util.HashMap;
import java.util.Map;

public class UserManager {

    private static volatile UserManager INSTANCE;
    private Map<String, User> userMap;

    private UserManager() {
        userMap = new HashMap<>();
    }

    public static UserManager getInstance() {
        if (INSTANCE == null) {
            synchronized (OrderManagerI.class) {
                if (INSTANCE == null) {
                    INSTANCE = new UserManager();
                }
            }
        }
        return INSTANCE;
    }

    public void addUser(String userId, User user){
        userMap.put(userId, user);
    }
}
