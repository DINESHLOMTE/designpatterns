package com.dp.behavioural.cor;

import java.util.Arrays;

public class Operator extends Approver {
	
	public Operator() {
	}
	
	public Operator(String name) {
		super(name);
	}
	
	@Override
	public void approve(String task) {
		if (!isTask(task)) {
			System.out.println("Invalid task!");
			return;
		}
		if (Arrays.asList("ADD").contains(task)) {
			System.out.println(
					"Operator has the previlage to approve the request to " + task);
			return;
		}
		System.out.println("Operator " + name 
				+ " does not have the previlage to approve the request to " 
				+ task + ", hence forwarding the request to the next approver " 
				+ nextApprover.name);
		nextApprover.approve(task);
	}
}