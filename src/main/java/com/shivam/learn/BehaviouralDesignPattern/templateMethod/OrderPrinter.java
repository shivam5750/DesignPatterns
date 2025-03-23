package com.shivam.learn.BehaviouralDesignPattern.templateMethod;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public abstract class OrderPrinter {
    

    public final void printOrder(Order order, String fileName) throws FileNotFoundException{
        try(PrintWriter printWriter = new PrintWriter(fileName)){
            printWriter.write(start());
            printWriter.write(formatOrderNumber(order));
            printWriter.write(formatItems(order));
            printWriter.write(formatTotal(order));
            printWriter.write(end());
        }
    }

    protected abstract String start();

    protected abstract String formatOrderNumber(Order order);

    protected abstract String formatItems(Order order);

    protected abstract String formatTotal(Order order);

    protected abstract String end();
}
