package com.shivam.learn.StructuralDesignPatterns.Adapter;


// The client class that needs certain object to design careds
public class BusinessCardDesigner {

    public String designCard(Customer customer){
        String card = "";
        card += customer.getName();
        card += "\n" + customer.getDesignation();
        card += "\n" + customer.getAddress();
        return card;
    }
    
}
