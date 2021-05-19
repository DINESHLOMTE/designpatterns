package com.dp.creational.abstractfactory;

public class TestAbstractFactory {
	public static void main(String[] args) {
		AbstractPolicy abstractPolicy = PolicyFactory.getInstance().getPolicy("G1");
		if (abstractPolicy == null) {
			System.out.println("Invalid Policy type.");
			return;
		}
		System.out.println("Policy Details");
		System.out.println("-------------------------------------------------");
		System.out.println("Type:        " + abstractPolicy.getPolicy().getType());
		System.out.println("Description: " + abstractPolicy.getPolicy().getDescription());
	}
}
