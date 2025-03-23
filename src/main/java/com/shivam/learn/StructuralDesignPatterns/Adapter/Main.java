package com.shivam.learn.StructuralDesignPatterns.Adapter;

import com.shivam.learn.StructuralDesignPatterns.Adapter.ClassAdapter.EmployeeClassAdapter;
import com.shivam.learn.StructuralDesignPatterns.Adapter.ObjectAdapter.EmployeeObjectAdapter;

public class Main {
    
    public static void main(String[] args) {
        /* using Class Adapter/ Two Adapter */
        EmployeeClassAdapter adapter = new EmployeeClassAdapter();
        populateEmployeeData(adapter);
        BusinessCardDesigner card = new BusinessCardDesigner();
        String cardPrinted = card.designCard(adapter);
        System.out.println(cardPrinted);

        /* Using Object Adapter  */
        Employee employee = new Employee();
        populateEmployeeData(employee);
        EmployeeObjectAdapter objectAdapter = new EmployeeObjectAdapter(employee);
        System.out.println(card.designCard(objectAdapter));

    }

    private static void populateEmployeeData(Employee employee){
        employee.setFullName("Lucky Desai");
        employee.setJobTitle("Sr. Manager");
        employee.setOfficeLocation("Banagalore WhiteField");
    }

}
