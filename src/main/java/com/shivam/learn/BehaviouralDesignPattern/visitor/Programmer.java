package com.shivam.learn.BehaviouralDesignPattern.visitor;

public class Programmer extends AbstractEmployee {

    private String skill;

    public Programmer(String name, String skill) {
        super(name);
        this.skill = skill;
    }
    
    public String getSkill(){
        return this.skill;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
