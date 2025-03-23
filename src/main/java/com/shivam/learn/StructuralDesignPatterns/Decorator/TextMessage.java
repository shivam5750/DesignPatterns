package com.shivam.learn.StructuralDesignPatterns.Decorator;

// Concrete component Object that needs to be decorated
public class TextMessage  implements Message{

    private String msg;
    public TextMessage (String msg){
        this.msg = msg;
    }

    @Override
    public String getContent() {
       return msg;
    }
    
}
