package com.shivam.learn.StructuralDesignPatterns.Facade.email;

public abstract class  Template {

    public enum TemplateType {Email, NewsLetter};
	
	public abstract String format(Object obj);
} 
