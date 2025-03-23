package com.shivam.learn.BehaviouralDesignPattern.iterator;

// Iterator interface allowing to iterate over
// values of an aggregate
public interface Iterator<T> {
    
    boolean hasNext();
    ThemeColor next();
}
