package com.dp.behavioural.template;

public class Group1 extends AbstractBase {
	
	public Group1() {
	}
	
	@Override
	public void load() {
		System.out.println("Loading - Group1 Data!");
	}
	
	@Override
	public void process() {
		System.out.println("Processing - Group1 Data!");
	}
	
	@Override
	public void display() {
		System.out.println("Displaying - Group1 Data!");
	}
}