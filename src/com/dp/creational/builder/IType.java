package com.dp.creational.builder;

import java.math.BigDecimal;

public interface IType {
	
	public String getType();
	public String getDescription();
	public BigDecimal getAmount();
}