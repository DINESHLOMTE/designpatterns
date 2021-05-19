package com.dp.structural.decorator;

import java.math.BigDecimal;

public interface IPolicy {
	
	public String getType();
	public String getDescription();
	public BigDecimal getAmount();
}