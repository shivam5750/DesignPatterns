package com.shivam.learn.StructuralDesignPatterns.Facade.email;

public class StationaryFactory {
    
    public static Stationary createStationary() {
		return new HalloweenStationary();
	}
}
