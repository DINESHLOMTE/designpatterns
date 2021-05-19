package com.dp.creational.builder;

import java.math.BigDecimal;

public class Policy1 extends Policy {
	
	public Policy1() {
	}
	
	@Override
	public String getDescription() {
		return "Policy P1 is of Policy1 type.";
	}
	
	@Override
	public BigDecimal getAmount() {
		return new BigDecimal("49.00");
	}
}