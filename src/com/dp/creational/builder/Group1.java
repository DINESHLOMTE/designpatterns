package com.dp.creational.builder;

import java.math.BigDecimal;

public class Group1 extends Policy {
	
	public Group1() {
	}
	
	@Override
	public String getDescription() {
		return "Policy G1 is of Group1 type.";
	}
	
	@Override
	public BigDecimal getAmount() {
		return new BigDecimal("87.00");
	}
}