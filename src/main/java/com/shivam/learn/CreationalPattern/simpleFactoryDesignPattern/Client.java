package com.shivam.learn.CreationalPattern.simpleFactoryDesignPattern;

public class Client {

    public static void main(String[] args) {
        Post post = PostFactory.createPost("blog");
        System.out.println(post.getClass());

    
        Thread thread1 = new Thread(new Worker("blog"));
        Thread thread2 = new Thread(new Worker("news"));
        Thread thread3 = new Thread(new Worker("blog"));
        Thread thread4 = new Thread(new Worker("product"));

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
