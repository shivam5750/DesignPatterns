package com.shivam.learn.StructuralDesignPatterns.Facade.email;

public class Email {
    
    public static EmailBuilder getBuilder() {
		return new EmailBuilder();
	}
}
