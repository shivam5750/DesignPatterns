package com.shivam.learn.StructuralDesignPatterns.Bridge;


// This is implementor
// Note that this is also and intterface
// As implementor is defining it's own hierarchy which is not related
// at all to the abstraction hierarchy
public interface LinkedList<T> {

    void addFirst(T element);

    T removeFirst();

    void addLast(T element);

    T removeLast();

    int getSize();
    
}
