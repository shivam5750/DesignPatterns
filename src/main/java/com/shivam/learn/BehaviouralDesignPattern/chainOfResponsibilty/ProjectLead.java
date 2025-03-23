package com.shivam.learn.BehaviouralDesignPattern.chainOfResponsibilty;

// A concrete handler
public class ProjectLead extends Employee{

    public ProjectLead(LeaveApprover successor){
        super("Project Lead", successor);
    }

    @Override
    protected boolean processRequest(LeaveApplication application) {
    //    if type of leave is sickLeave or duration is <= 2
        if(application.getType() == LeaveApplication.Type.Sick ){
            if(application.getNoOfDays() <= 2){
                return true;
            }
        }

        return false;
    }
    
}
