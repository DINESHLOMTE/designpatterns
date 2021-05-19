package com.dp.behavioural.strategy;

public class Policy1 implements IPolicy {
	
	public Policy1() {
	}
	
	@Override
	public void execute(String value) {
		System.out.println("Policy " + value + " is of Policy1 type.");
	}
}