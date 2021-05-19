package com.dp.creational.abstractfactory;

import java.util.Arrays;

public enum PolicyFactory {
	
	INSTANCE;
	
	private PolicyFactory() {
	}
	
	public static PolicyFactory getInstance() {
		return INSTANCE;
	}
	
	public AbstractPolicy getPolicy(String type) {
		if (type == null || type.trim().isEmpty()
				|| !Arrays.asList("P1", "G1").contains(type)) {
			return null;
		}
		if (type.equals("P1")) {
			return new Policy1();
		}
		return new Group1();
	}
}