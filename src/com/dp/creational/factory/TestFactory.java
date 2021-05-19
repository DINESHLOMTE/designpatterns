package com.dp.creational.factory;

public class TestFactory {
	
	public static void main(String[] args) {
		Policy policy = PolicyFactory.getInstance().getPolicy("G1");
		if (policy == null) {
			System.out.println("Invalid policy type.");
			return;
		}
		System.out.println("Policy Details");
		System.out.println("---------------------------------------------");
		System.out.println("Type: " + policy.getType());
		System.out.println("Description: " + policy.getDescription());
	}
}