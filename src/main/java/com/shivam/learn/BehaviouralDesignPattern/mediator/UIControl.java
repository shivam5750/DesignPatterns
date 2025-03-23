package com.shivam.learn.BehaviouralDesignPattern.mediator;

//Abstract colleague
public interface UIControl {
	
	void controlChanged(UIControl control);
	
	String getControlValue();
	
	String getControlName();
}
