package com.dp.creational.abstractfactory;

public class Group1 extends AbstractPolicy {
	
	public Group1() {
	}
	
	@Override
	public Policy getPolicy() {
		return new Policy("G1", "Policy G1 is of Group1 type");
	}
}