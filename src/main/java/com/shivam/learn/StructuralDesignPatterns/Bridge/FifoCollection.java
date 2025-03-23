package com.shivam.learn.StructuralDesignPatterns.Bridge;

// This is the abstraction
// It represents the first in first out collection
public interface FifoCollection<T> {

   // Adds element to fifo
   void offer(T element);
   
   // Removes and returns first element from the collection
   T poll();

} 
