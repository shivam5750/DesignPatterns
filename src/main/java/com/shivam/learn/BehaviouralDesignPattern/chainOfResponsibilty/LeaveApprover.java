package com.shivam.learn.BehaviouralDesignPattern.chainOfResponsibilty;

// Represnts a handler in chain of resposibility
public interface LeaveApprover {
    
    void processLeaveApplication(LeaveApplication application);

    String getApproverRole();
}
