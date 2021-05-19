package com.dp.creational.builder;

public abstract class Policy implements IType {
	
	public Policy() {
	}
	
	@Override
	public String getType() {
		return "Travel Policy";
	}
}