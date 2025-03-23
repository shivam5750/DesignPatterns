package com.shivam.learn.StructuralDesignPatterns.Facade.email;

public class OrderEmailTemplate extends Template {
    
    @Override
	public String format(Object obj) {
		return "TEMPLATE";
	}

}
