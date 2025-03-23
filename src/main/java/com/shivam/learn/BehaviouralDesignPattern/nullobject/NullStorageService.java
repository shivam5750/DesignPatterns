package com.shivam.learn.BehaviouralDesignPattern.nullobject;

import java.io.PrintWriter;

public class NullStorageService extends StorageService {

    @Override
    public boolean save(Report report) {
        System.out.println("null object Saved : Doing Nothing");
        return true;
    }
}
