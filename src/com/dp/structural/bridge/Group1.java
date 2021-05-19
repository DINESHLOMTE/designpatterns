package com.dp.structural.bridge;

public class Group1 implements IPolicy {
	
	public Group1() {
	}
	
	@Override
	public String getPolicy() {
		return "Policy G1 is of Group1 type.";
	}
}