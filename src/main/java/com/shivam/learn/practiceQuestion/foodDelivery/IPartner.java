package com.shivam.learn.practiceQuestion.foodDelivery;

import com.shivam.learn.practiceQuestion.foodDelivery.Commons.Rating;

public abstract class IPartner {
    
    protected String name;
    protected Rating rating;

    public IPartner(String name){
        this.name = name;
        rating = Rating.UNASSIGNED;
    }

    public String getName(){
        return name;
    }

    public void setRating(Rating rating){
        this.rating = rating;
    }
}
