package com.shivam.learn.CreationalPattern.AbstractFactoryDesignPattern.Interfaces;

// Abstract Factory defined for each object type
public interface ResourceFactory {
    
    Instance createInstance(Instance.Capacity capacity);

    Storage createStorage(int capMib);
}
