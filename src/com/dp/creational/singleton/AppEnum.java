package com.dp.creational.singleton;

public enum AppEnum {
	
	INSTANCE;
	
	private AppEnum() {
	}
	
	public static AppEnum getInstance() {
		return INSTANCE;
	}
	
	public void display() {
		System.out.println("Display method called!");
	}
}