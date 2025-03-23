package com.shivam.learn.practiceQuestion.foodDelivery;

import com.shivam.learn.practiceQuestion.foodDelivery.Commons.Location;

public class User {

    private Location location;
    private String userId;

   public User(String userId, Location location){
      this.userId = userId;
      this.location = location;
   }
    
    public Location getLocation() {
       return this.location;
    }

    public String getUserId() {
        return this.userId;
     }
    
}
