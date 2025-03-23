package com.shivam.learn.StructuralDesignPatterns.Adapter.ObjectAdapter;

import com.shivam.learn.StructuralDesignPatterns.Adapter.Customer;
import com.shivam.learn.StructuralDesignPatterns.Adapter.Employee;

/*
 * An adapter object using composition to translate interface
 */
public class EmployeeObjectAdapter implements Customer {

    private Employee adaptee;
    
    public EmployeeObjectAdapter(Employee employee){
        this.adaptee = employee;
    }

    @Override
    public String getName() {
       return this.adaptee.getFullName();
    }

    @Override
    public String getDesignation() {
       return this.adaptee.getJobTitle();
    }

    @Override
    public String getAddress() {
        return this.adaptee.getOfficeLocation();
    }
    
}
