package com.shivam.learn.BehaviouralDesignPattern.chainOfResponsibilty;

import java.time.LocalDate;

import com.shivam.learn.BehaviouralDesignPattern.chainOfResponsibilty.LeaveApplication.Type;

public class Client {
    
    public static void main(String[] args) {
        LeaveApplication application = LeaveApplication.getBuilder().withType(Type.Sick)
                                       .from(LocalDate.now())
                                       .to(LocalDate.of(2024, 7, 15))
                                       .build();

        System.out.println(application);
        System.out.println("****************************************************");
        LeaveApprover leaveApprover = createChain();
        leaveApprover.processLeaveApplication(application);
        System.out.println(application);
    }

    private static  LeaveApprover createChain(){
        Director dir = new Director(null);
        Manager manager = new Manager(dir);
        ProjectLead lead =new ProjectLead(manager);

        return lead;
    }
}
