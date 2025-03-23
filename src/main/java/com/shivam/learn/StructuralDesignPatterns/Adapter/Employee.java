package com.shivam.learn.StructuralDesignPatterns.Adapter;

// An existing java class that has all the functionality
// THe Adaptee class in our case
public class Employee {

    private String fullName;

    private String jobTitle;

    private String officeLocation;


    public String getFullName() {
        return this.fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getJobTitle() {
        return this.jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getOfficeLocation() {
        return this.officeLocation;
    }

    public void setOfficeLocation(String officeLocation) {
        this.officeLocation = officeLocation;
    }

    
}
