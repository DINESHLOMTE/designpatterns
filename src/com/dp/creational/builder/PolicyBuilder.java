package com.dp.creational.builder;

public enum PolicyBuilder {
	
	INSTANCE;
	
	private PolicyBuilder() {
	}
	
	public static PolicyBuilder getInstance() {
		return INSTANCE;
	}
	
	public PolicyHolder travelPolicyBuilder(IType... iTypes) {
		PolicyHolder policyHolder = new PolicyHolder();
		policyHolder.add(iTypes);
		return policyHolder;
	}
}