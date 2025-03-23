package com.shivam.learn.BehaviouralDesignPattern.command;

// Concrete command
public class AddMemberCommand implements Command{

    private String emailAddress;

    private String listName;

    private EWSService reciever;

    public AddMemberCommand(String email, String listName, EWSService ewsService){
        this.emailAddress = email;
        this.listName = listName;
        this.reciever = ewsService;
    }

    @Override
    public void execute() {
        reciever.addMember(listName, emailAddress);
    }
    
}
