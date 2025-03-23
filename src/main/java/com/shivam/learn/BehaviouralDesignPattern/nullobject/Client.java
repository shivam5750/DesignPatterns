package com.shivam.learn.BehaviouralDesignPattern.nullobject;

public class Client {
    
    public static void main(String[] args) {
        ComplexService service = new ComplexService(new NullStorageService(), "new Complex Service");
        service.generateReport();
    }
}
