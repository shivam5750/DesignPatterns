package com.shivam.learn.BehaviouralDesignPattern.command;


// This class represents the reciever
public class EWSService {

    // Add new member to mailing list
    public void addMember(String contact, String contactGroup){
        // contact exchange
        System.out.println("Added " +contact + " to "+ contactGroup);
    }

    // Remove member from mailing list
    public void removeMember(String contact, String contactGroup){
        // contact exchange
        System.out.println("Remove " +contact + " from "+ contactGroup);
    }
    
}
