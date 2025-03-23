package com.shivam.learn.BehaviouralDesignPattern;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() ->{
            System.out.println("Thread 1");
            Yuhi  y = Yuhi.getInstance();
            System.out.println(y.hashCode());
        });
    
        Thread t2 = new Thread(() ->{
            System.out.println("Thread 2");
            Yuhi  y = Yuhi.getInstance();
            System.out.println(y.hashCode());

        });
        
        t1.start();
        
        t2.start();
    }

    

    
}

class Yuhi{
    private static Yuhi INSTANCE = new Yuhi();

    private Yuhi(){
        System.out.println("hello");
    }
    public static Yuhi getInstance(){
        return INSTANCE;
    }

}
