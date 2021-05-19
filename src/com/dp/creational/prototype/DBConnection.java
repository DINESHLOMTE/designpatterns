package com.dp.creational.prototype;

public class DBConnection {
	
	private String name;
	
	public DBConnection() {
	}
	
	public DBConnection(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}