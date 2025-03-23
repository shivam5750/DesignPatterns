package com.shivam.learn.StructuralDesignPatterns.Proxy;

// Factory to get Image Objects
public class ImageFactory {

    // we'll provide proxy to caller instead of real objects

    public static Image getImage(String fileName){
        return new ImageProxy(fileName);

    }
    
}
