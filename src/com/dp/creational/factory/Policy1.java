package com.dp.creational.factory;

public class Policy1 extends Policy {
	
	public Policy1() {
	}
	
	public Policy1(String type) {
		super(type);
	}
	
	@Override
	public String getDescription() {
		return "Policy " + type + " is of Policy1 type.";
	}
}
