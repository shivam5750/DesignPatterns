package com.shivam.learn.CreationalPattern.FactoryDesignPattern;

public class TextMessage extends Message{

    @Override
    public String getContent() {
       return "newText";
    }
    
}
