package com.shivam.learn.CreationalPattern.AbstractFactoryDesignPattern.gcp;

import com.shivam.learn.CreationalPattern.AbstractFactoryDesignPattern.Interfaces.Instance;
import com.shivam.learn.CreationalPattern.AbstractFactoryDesignPattern.Interfaces.Instance.Capacity;
import com.shivam.learn.CreationalPattern.AbstractFactoryDesignPattern.Interfaces.ResourceFactory;
import com.shivam.learn.CreationalPattern.AbstractFactoryDesignPattern.Interfaces.Storage;

public class GoogleCloudResourceFactory implements ResourceFactory{

    @Override
    public Instance createInstance(Capacity capacity) {
        return new GoogleComputeEngineInstance(capacity);
    }

    @Override
    public Storage createStorage(int capMib) {
       return new GoogleCloudStorage(capMib);
    }
    
}
