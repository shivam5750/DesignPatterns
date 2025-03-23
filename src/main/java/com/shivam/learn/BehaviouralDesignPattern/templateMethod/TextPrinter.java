package com.shivam.learn.BehaviouralDesignPattern.templateMethod;

import java.util.Map;

public class TextPrinter extends OrderPrinter{

    @Override
    protected String start() {
        return "ORDER DETAILS";
    }

    @Override
    protected String formatOrderNumber(Order order) {
        return "Order Id #"+ order.getId();
    }

    @Override
    protected String formatItems(Order order) {
        StringBuilder builder = new StringBuilder();
        builder.append("\n");
        for(Map.Entry<String, Double> entry : order.getItems().entrySet()){
            builder.append(entry.getKey() + " : $"+ entry.getValue() + "\n");
        }
        builder.append("---------------------------\n");
        return builder.toString();
    }

    @Override
    protected String formatTotal(Order order) {
        return "Order Total :- $" + order.getTotal();
    }

    @Override
    protected String end() {
       return "";
    }
    
}
