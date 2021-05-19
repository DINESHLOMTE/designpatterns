package com.dp.structural.decorator;

import java.math.BigDecimal;

public abstract class AbstractPolicy implements IPolicy {
	
	protected IPolicy iPolicy;
	
	public AbstractPolicy() {
	}
	
	public AbstractPolicy(IPolicy iPolicy) {
		this.iPolicy = iPolicy;
	}
	
	@Override
	public BigDecimal getAmount() {
		return iPolicy.getAmount();
	}
}