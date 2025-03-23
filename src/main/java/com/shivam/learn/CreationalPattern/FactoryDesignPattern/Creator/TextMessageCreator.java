package com.shivam.learn.CreationalPattern.FactoryDesignPattern.Creator;

import com.shivam.learn.CreationalPattern.FactoryDesignPattern.Message;
import com.shivam.learn.CreationalPattern.FactoryDesignPattern.TextMessage;

public class TextMessageCreator extends MessageCreator {

    @Override
    public Message createMessage() {
       return new TextMessage();
    }
    
}
