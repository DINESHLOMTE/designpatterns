package com.dp.creational.factory;

public class Policy {

	protected String type;
	protected String description;
	
	public Policy() {
	}
	
	public Policy(String type) {
		this.type = type;
	}
	
	public Policy(String type, String description) {
		this.type = type;
		this.description = description;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}