package com.shivam.learn.BehaviouralDesignPattern.strategy;

import java.util.Collection;

//Strategy
public interface OrderPrinter {
	
	void print(Collection<Order> orders);
}
