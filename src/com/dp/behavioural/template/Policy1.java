package com.dp.behavioural.template;

public class Policy1 extends AbstractBase {

	public Policy1() {
	}
	
	@Override
	public void load() {
		System.out.println("Loading - Policy1 Data!");
	}
	
	@Override
	public void process() {
		System.out.println("Processing - Policy1 Data!");
	}
	
	@Override
	public void display() {
		System.out.println("Displaying - Policy1 Data!");
	}
}