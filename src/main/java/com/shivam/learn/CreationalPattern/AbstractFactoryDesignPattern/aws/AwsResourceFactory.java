package com.shivam.learn.CreationalPattern.AbstractFactoryDesignPattern.aws;

import com.shivam.learn.CreationalPattern.AbstractFactoryDesignPattern.Interfaces.Instance;
import com.shivam.learn.CreationalPattern.AbstractFactoryDesignPattern.Interfaces.Instance.Capacity;
import com.shivam.learn.CreationalPattern.AbstractFactoryDesignPattern.Interfaces.ResourceFactory;
import com.shivam.learn.CreationalPattern.AbstractFactoryDesignPattern.Interfaces.Storage;

// Factory implementation for AWS cloud platform
public class AwsResourceFactory implements ResourceFactory {

    @Override
    public Instance createInstance(Capacity capacity) {
       return new Ec2Instance(capacity);
    }

    @Override
    public Storage createStorage(int capMib) {
        return new S3Storage(capMib);
    }
    
}
