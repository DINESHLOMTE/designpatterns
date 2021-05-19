package com.dp.structural.bridge;

public class Policy1 implements IPolicy {
	
	public Policy1() {
	}
	
	@Override
	public String getPolicy() {
		return "Policy P1 is of Policy1 type.";
	}
}