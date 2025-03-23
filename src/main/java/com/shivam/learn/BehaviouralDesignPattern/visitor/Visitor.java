package com.shivam.learn.BehaviouralDesignPattern.visitor;

public interface Visitor {
    
    void visit(Programmer programmer);
    void visit(ProjectLead projectLead);
    void visit(Manager manager);
    void visit(VicePresident vp);
}
