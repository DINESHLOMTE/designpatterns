package com.dp.behavioural.visitor;

public class TestVisitor {
	public static void main(String[] args) {
		
		new Policy().accept(new DisplayPolicyDetails());
	}
}