package com.shivam.learn.StructuralDesignPatterns.Bridge;

public class Client {
    
    public static void main(String[] args) {
        FifoCollection<Integer> collection = new Queue<>(new SinglyLinkedList<Integer>());
        collection.offer(56);
        collection.offer(48);
        collection.offer(10);

        System.out.println(collection.poll());
        System.out.println(collection.poll());
        System.out.println(collection.poll());

    }
}
