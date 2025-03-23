package com.shivam.learn.CreationalPattern.FactoryDesignPattern.Creator;

import com.shivam.learn.CreationalPattern.FactoryDesignPattern.JSONMessage;
import com.shivam.learn.CreationalPattern.FactoryDesignPattern.Message;

public class JsonMessageCreator extends MessageCreator {

    @Override
    public Message createMessage() {
        return new JSONMessage();
    }
    
}
