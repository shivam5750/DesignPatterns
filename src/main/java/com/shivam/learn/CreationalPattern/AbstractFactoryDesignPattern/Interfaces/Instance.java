package com.shivam.learn.CreationalPattern.AbstractFactoryDesignPattern.Interfaces;

// Represents abstract product
public interface Instance {
    
    enum Capacity{small, medium, large};

    void start();
    void stop();
    void attachStorage(Storage storage);
}
