package com.shivam.learn.CreationalPattern.FactoryDesignPattern;

import com.shivam.learn.CreationalPattern.FactoryDesignPattern.Creator.JsonMessageCreator;
import com.shivam.learn.CreationalPattern.FactoryDesignPattern.Creator.MessageCreator;
import com.shivam.learn.CreationalPattern.FactoryDesignPattern.Creator.TextMessageCreator;

public class Client {
    
    public static void main(String[] args) {
        printMessage(new JsonMessageCreator());
        printMessage(new TextMessageCreator());
    }

    private static void printMessage(MessageCreator creator) {
        Message msg = creator.getMessage();
        System.out.println(msg.getContent());
    }
}
