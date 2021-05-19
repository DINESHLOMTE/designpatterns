package com.dp.behavioural.strategy;

public class TestStrategy {
	public static void main(String[] args) {
		new PolicyContext(new Policy1()).execute("P1");
		System.out.println();
		new PolicyContext(new Group1()).execute("G1");
	}
}