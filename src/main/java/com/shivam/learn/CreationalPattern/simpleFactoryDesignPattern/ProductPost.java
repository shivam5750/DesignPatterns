package com.shivam.learn.CreationalPattern.simpleFactoryDesignPattern;

public class ProductPost extends Post {
    
    private String name;

    private String imageUrl;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }


}
