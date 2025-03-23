package com.shivam.learn.CreationalPattern.FactoryDesignPattern;


/*
 * Thei class represents the interface for our "product " whic is message
 * Implementation will be specific to content type
 */
public abstract class Message {
    
    public abstract String getContent();
    
    public void addDefaultHeaders(){
        //Add Some Deafult Headers
    }

    public void encrypt(){
        // Add Some Default encrypt
    }
}
