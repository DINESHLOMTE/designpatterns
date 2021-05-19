package com.dp.behavioural.cor;

import java.util.Arrays;

public class Supervisor extends Approver {
	
	public Supervisor() {
	}
	
	public Supervisor(String name) {
		super(name);
	}
	
	@Override
	public void approve(String task) {
		if (!isTask(task)) {
			System.out.println("Invalid task!");
			return;
		}
		if (Arrays.asList("ADD", "MOD").contains(task)) {
			System.out.println(
					"Supervisor has the previlage to approve the request to " + task);
			return;
		}
		System.out.println("Supervisor " + name 
				+ " does not have the previlage to approve the request to " 
				+ task + ", hence forwarding the request to the next approver " 
				+ nextApprover.name);
		nextApprover.approve(task);
	}
}