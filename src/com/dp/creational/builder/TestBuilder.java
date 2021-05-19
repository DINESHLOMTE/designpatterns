package com.dp.creational.builder;

public class TestBuilder {
	public static void main(String[] args) {
		PolicyBuilder.getInstance().travelPolicyBuilder(
				new Policy1(), new Group1(), new Policy1()).display();
	}
}