package com.shivam.learn.CreationalPattern.FactoryDesignPattern;

public class JSONMessage extends Message {

    @Override
    public String getContent() {
        return "{\"JSON\" : []}";
    }
    
}
