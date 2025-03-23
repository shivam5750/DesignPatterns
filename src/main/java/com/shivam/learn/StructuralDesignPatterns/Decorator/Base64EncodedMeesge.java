package com.shivam.learn.StructuralDesignPatterns.Decorator;

import java.util.Base64;

public class Base64EncodedMeesge implements Message{
    
    private Message msg;

      public Base64EncodedMeesge(Message msg) {
        this.msg = msg;
    }

    @Override
    public String getContent() {
        return Base64.getEncoder().encodeToString(msg.getContent().getBytes());
    }
}
