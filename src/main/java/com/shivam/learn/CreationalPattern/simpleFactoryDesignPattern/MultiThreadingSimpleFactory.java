package com.shivam.learn.CreationalPattern.simpleFactoryDesignPattern;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MultiThreadingSimpleFactory {
     private static final Lock lock = new ReentrantLock();

     public static Post createPost(String type){
        lock.lock();
        try{
            switch (type) {
                case "blog":
                    return new BlogPost();
                case "news":
                    return new NewsPost();
                case "product":
                    return new ProductPost();
                default:
                    throw new IllegalArgumentException("Post type is Invalid");
            
            }
        }finally{
            lock.unlock();
        }
    }
}

// Worker class for multithreading
class Worker implements Runnable {
    private final String productType;

    public Worker(String productType) {
        this.productType = productType;
    }

    @Override
    public void run() {
        Post post = MultiThreadingSimpleFactory.createPost(productType);
        if (post != null) {
            System.out.println(post.getClass());
        }
    }
}



