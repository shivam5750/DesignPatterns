package com.shivam.learn.BehaviouralDesignPattern.templateMethod;

import java.io.FileNotFoundException;

public class Client {
    public static void main(String[] args) throws FileNotFoundException {
        Order order = new Order("10001");
        order.addItem("Soda", 2.50);
        order.addItem("Medicine", 90.89);
        order.addItem("Milk", 10.0);
        order.addItem("Hammer", 50.56);

        OrderPrinter printer = new TextPrinter();
        printer.printOrder(order, "1001.txt");
    }
    
}
