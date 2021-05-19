package com.dp.behavioural.strategy;

public class Group1 implements IPolicy {
	
	public Group1() {
	}
	
	@Override
	public void execute(String value) {
		System.out.println("Policy " + value + " is of Group1 type.");
	}
}