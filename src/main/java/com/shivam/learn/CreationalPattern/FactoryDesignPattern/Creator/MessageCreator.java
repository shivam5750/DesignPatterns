package com.shivam.learn.CreationalPattern.FactoryDesignPattern.Creator;

import com.shivam.learn.CreationalPattern.FactoryDesignPattern.Message;

/*
 * Abstract creator class 
 * This class needs to be implemented by the all it creator subclasses
 */
public  abstract class MessageCreator {
    
    public Message getMessage(){
        Message msg = createMessage();
        msg.addDefaultHeaders();
        msg.encrypt();
        return msg;
    }

    // Abstract Factory Method
    public abstract Message createMessage();
}
