package com.shivam.learn.BehaviouralDesignPattern.chainOfResponsibilty;

public class Manager extends Employee {



    public Manager(LeaveApprover successor) {
        super("Manager", successor);
    }

    @Override
    protected boolean processRequest(LeaveApplication application) {
        switch (application.getType()) {
            case Sick:
                application.approve(getApproverRole());
                return true;
            case PTO:
                if(application.getNoOfDays() <=5){
                    application.approve(getApproverRole());
                    return true;
                }
            default:
                break;
        
        }
        return false;
    }
    
}
