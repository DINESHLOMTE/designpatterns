package com.dp.structural.decorator;

import java.math.BigDecimal;

public class Group1 extends AbstractPolicy {
	
	public Group1() {
	}
	
	public Group1(IPolicy iPolicy) {
		super(iPolicy);
	}
	
	@Override
	public String getType() {
		return "G1";
	}
	
	@Override
	public String getDescription() {
		return "Policy " + getType() + " is of Group1 type.";
	}
	
	@Override
	public BigDecimal getAmount() {
		return new BigDecimal("56.00").add(super.getAmount());
	}
}