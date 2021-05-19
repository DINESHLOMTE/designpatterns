package com.dp.structural.proxy;

public class DataLoader {
	
	private String name;
	
	public DataLoader() {
	}
	
	public DataLoader(String name) {
		this .name = name;
		loadImage();
	}

	public void loadImage() {
		System.out.println("Loading Data - " + name);
	}
	
	public void display() {
		System.out.println("Displaying Data - " + name);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}