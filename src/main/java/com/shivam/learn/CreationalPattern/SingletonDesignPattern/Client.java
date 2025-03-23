package com.shivam.learn.CreationalPattern.SingletonDesignPattern;

public class Client {

    public static void main(String[] args) {
        System.out.println("XXXXXXXX--EAGER INITILIZATION--XXXXXXXX");
        EagerSingleton registery = EagerSingleton.getInstance();
        EagerSingleton registery2 = EagerSingleton.getInstance();
        System.out.println(registery == registery2);
        System.out.println("XXXXXXX--LAZY INITILIZATION--XXXXXXXX");
        LazySingletonWithDCL lazyRegistery = LazySingletonWithDCL.getInstance();
        LazySingletonWithDCL lazyRegistery2 = LazySingletonWithDCL.getInstance();
        System.out.println(lazyRegistery == lazyRegistery2);
        System.out.println("XXXXXXX--LAZY INITILIZATION INNER CLASS HOLDER--XXXXXXXX");
        LazySingletonIDOM.getInstance();
        LazySingletonIDOM.getInstance();
        LazySingletonIDOM.getInstance();
    }

}
