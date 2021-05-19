package com.dp.creational.builder;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PolicyHolder {
	
	private List<IType> types;
	
	public PolicyHolder() {
	}

	public void add(IType... types) {
		if (types == null || types.length == 0) {
			return;
		}
		getTypes().addAll(Arrays.asList(types));
	}
	
	public void display() {
		if (getTypes().isEmpty()) {
			System.out.println("No elements exist to display.");
			return;
		}
		BigDecimal total = new BigDecimal("0.00");
		System.out.println("Policy Details");
		System.out.println("-------------------------------------------------");
		System.out.println("Type:        " + getTypes().get(0).getType());
		for (IType iType : getTypes()) {
			System.out.println("-------------------------------------------------");
			System.out.println("Description: " + iType.getDescription());
			System.out.println("Amount:      " + iType.getAmount());
			
			total = total.add(iType.getAmount());
		}
		System.out.println("-------------------------------------------------");
		System.out.println("Total:       " + total);
		System.out.println("-------------------------------------------------");
	}
	
	public List<IType> getTypes() {
		return (types == null) ? types = new ArrayList<IType>() : types;
	}

	public void setTypes(List<IType> types) {
		this.types = types;
	}
}