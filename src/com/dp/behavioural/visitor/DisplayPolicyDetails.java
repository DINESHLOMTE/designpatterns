package com.dp.behavioural.visitor;

public class DisplayPolicyDetails implements IVisitor {
	
	public DisplayPolicyDetails() {
	}
	
	@Override
	public void visit(Policy policy) {
		System.out.println("Displaying the Policy Details");
	}
	
	@Override
	public void visit(PolicyHolder policyHolder) {
		System.out.println("Displaying the Policy Holder Details");
	}
}