package com.dp.structural.flyweight;

public class Division implements IDivision {
	
	private String name;
	
	public Division() {
	}
	
	public Division(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}