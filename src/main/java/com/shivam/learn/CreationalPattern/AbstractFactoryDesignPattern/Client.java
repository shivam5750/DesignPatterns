package com.shivam.learn.CreationalPattern.AbstractFactoryDesignPattern;

import com.shivam.learn.CreationalPattern.AbstractFactoryDesignPattern.Interfaces.Instance;
import com.shivam.learn.CreationalPattern.AbstractFactoryDesignPattern.Interfaces.ResourceFactory;
import com.shivam.learn.CreationalPattern.AbstractFactoryDesignPattern.Interfaces.Storage;
import com.shivam.learn.CreationalPattern.AbstractFactoryDesignPattern.aws.AwsResourceFactory;

public class Client {
    
    private ResourceFactory factory;

    public Client(ResourceFactory resourceFactory){
        this.factory = resourceFactory;
    }

    public Instance createServer(Instance.Capacity capacity, int capMib){
        Instance instance = factory.createInstance(capacity);
        Storage storage = factory.createStorage(capMib);
        instance.attachStorage(storage);
        return instance;
    }
    public static void main(String[] args) {
        Client client = new Client(new AwsResourceFactory());
        Instance i1 = client.createServer(Instance.Capacity.medium, 1024);
        i1.start();
        i1.stop();
    }
}
