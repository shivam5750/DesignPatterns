package com.shivam.learn.StructuralDesignPatterns.Decorator;

public class Client {
    
    public static void main(String[] args) {
        Message m = new TextMessage("Hahah we won the <ICC> T20 WorldCup Indiaaaaa");
        System.out.println(m.getContent());

        Message decorator = new HtmlEncodedMsg(m);
        System.out.println(decorator.getContent());

        Message base64EncodeDrecorator = new Base64EncodedMeesge(m);
        System.out.println(base64EncodeDrecorator.getContent());
    }
}
