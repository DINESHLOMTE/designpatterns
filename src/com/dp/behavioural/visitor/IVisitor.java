package com.dp.behavioural.visitor;

public interface IVisitor {
	public void visit(Policy policy);
	public void visit(PolicyHolder policyHolder);
}