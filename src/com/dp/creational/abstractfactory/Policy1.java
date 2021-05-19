package com.dp.creational.abstractfactory;

public class Policy1 extends AbstractPolicy {
	
	public Policy1() {
	}
	
	@Override
	public Policy getPolicy() {
		return new Policy("P1", "Policy P1 is of Policy1 type.");
	}
}