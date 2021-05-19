package com.dp.behavioural.visitor;

public class PolicyHolder implements IPolicy {
	
	public PolicyHolder() {
	}
	
	@Override
	public void accept(IVisitor iVisitor) {
		iVisitor.visit(this);
	}
}