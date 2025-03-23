package com.shivam.learn.CreationalPattern.SingletonDesignPattern;

public class LazySingletonIDOM {
    
    private LazySingletonIDOM(){
        System.out.println("Call made to constructor");
    }

    private static class RegistryHolder{
        public static final LazySingletonIDOM INSTANCE = new LazySingletonIDOM();
    }

    public static LazySingletonIDOM getInstance(){
        return RegistryHolder.INSTANCE;
    }
}
