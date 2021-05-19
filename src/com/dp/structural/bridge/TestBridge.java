package com.dp.structural.bridge;

public class TestBridge {
	public static void main(String[] args) {
		new PolicyIssuance(new Policy1()).issuance();
		System.out.println();
		new PolicyIssuance(new Group1()).issuance();
	}
}