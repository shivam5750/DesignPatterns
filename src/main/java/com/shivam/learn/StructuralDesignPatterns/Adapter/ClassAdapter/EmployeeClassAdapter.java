package com.shivam.learn.StructuralDesignPatterns.Adapter.ClassAdapter;

import com.shivam.learn.StructuralDesignPatterns.Adapter.Customer;
import com.shivam.learn.StructuralDesignPatterns.Adapter.Employee;

/*
 * THis is class Adapter also called Two-way Adapter
 * Adapter Class
 */
public class EmployeeClassAdapter extends Employee implements Customer{

    @Override
    public String getName() {
        return this.getFullName();
    }

    @Override
    public String getDesignation() {
        return this.getJobTitle();
    }

    @Override
    public String getAddress() {
       return this.getOfficeLocation();
    }
    
}
