package com.dp.creational.factory;

import java.util.Arrays;

public enum PolicyFactory {
	
	INSTANCE;
	
	private PolicyFactory() {
	}
	
	public static PolicyFactory getInstance() {
		return INSTANCE;
	}

	public Policy getPolicy(String type) {
		if (type == null || type.trim().isEmpty()
				|| !Arrays.asList("P1", "G1").contains(type)) {
			return null;
		}
		if (type.equals("P1")) {
			return new Policy1(type);
		}
		return new Group1(type);
	}
}