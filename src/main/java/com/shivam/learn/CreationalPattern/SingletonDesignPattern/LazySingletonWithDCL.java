package com.shivam.learn.CreationalPattern.SingletonDesignPattern;

/**
 * This class demonstrates singleton pattern using Double Checked Locking or "classic" singleton.
 * This is also a lazy initializing singleton.
 * Although this implementation solves the multi-threading issue with lazy initialization using volatile
 * and double check locking, the volatile keyword is guaranteed to work only after JVMs starting with
 * version 1.5 and later.
 * Volatile keyword forces read and write direct from main memory instead of cache
 */
public class LazySingletonWithDCL {
    
    private LazySingletonWithDCL(){

    }

    public static volatile LazySingletonWithDCL INSTANCE;

    public static LazySingletonWithDCL getInstance(){
        if(INSTANCE == null){
            synchronized(LazySingletonWithDCL.class){
                if(INSTANCE == null){
                    INSTANCE = new LazySingletonWithDCL();
                }
            }
        }
        return INSTANCE;
    }
}
