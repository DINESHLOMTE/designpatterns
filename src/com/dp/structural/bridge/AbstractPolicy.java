package com.dp.structural.bridge;

public abstract class AbstractPolicy {
	
	protected IPolicy iPolicy;
	
	public AbstractPolicy() {
	}
	
	public AbstractPolicy(IPolicy iPolicy) {
		this.iPolicy = iPolicy;
	}
}