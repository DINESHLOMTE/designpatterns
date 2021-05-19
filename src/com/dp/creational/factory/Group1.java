package com.dp.creational.factory;

public class Group1 extends Policy {
	
	public Group1() {
		super();
	}
	
	public Group1(String type) {
		super(type);
	}
	
	@Override
	public String getDescription() {
		return "Policy " + type + " is of Group1 type.";
	}
}