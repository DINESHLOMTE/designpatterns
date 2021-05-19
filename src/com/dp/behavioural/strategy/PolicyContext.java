package com.dp.behavioural.strategy;

public class PolicyContext implements IPolicy {
	
	private IPolicy iPolicy;
	
	public PolicyContext() {
	}

	public PolicyContext(IPolicy iPolicy) {
		this.iPolicy = iPolicy;
	}
	
	@Override
	public void execute(String value) {
		iPolicy.execute(value);
	}
}