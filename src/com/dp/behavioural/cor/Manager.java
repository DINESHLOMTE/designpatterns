package com.dp.behavioural.cor;

public class Manager extends Approver {
	
	public Manager() {
	}
	
	public Manager(String name) {
		super(name);
	}
	
	@Override
	public void approve(String task) {
		if (!isTask(task)) {
			System.out.println("Invalid task!");
			return;
		}
		System.out.println("Manager has the previlage to approve the request to " + task);
	}
}