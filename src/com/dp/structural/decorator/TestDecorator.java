package com.dp.structural.decorator;

public class TestDecorator {
	public static void main(String[] args) {
		IPolicy iPolicy = new Policy1();
		display(iPolicy);
		System.out.println();
		display(new Group1(iPolicy));
	}
	
	public static void display(IPolicy iPolicy) {
		System.out.println("Policy Details");
		System.out.println("-------------------------------------------------");
		System.out.println("Type:        " + iPolicy.getType());
		System.out.println("Description: " + iPolicy.getDescription());
		System.out.println("Amount:      " + iPolicy.getAmount());
	}
}