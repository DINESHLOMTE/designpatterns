package com.dp.structural.decorator;

import java.math.BigDecimal;

public class Policy1 implements IPolicy {
	
	public Policy1() {
	}
	
	@Override
	public String getType() {
		return "P1";
	}
	
	@Override
	public String getDescription() {
		return "Policy " + getType() + " is of Policy1 type.";
	}
	
	@Override
	public BigDecimal getAmount() {
		return new BigDecimal("49.00");
	}
}