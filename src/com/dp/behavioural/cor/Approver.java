package com.dp.behavioural.cor;

import java.util.Arrays;

public abstract class Approver {
	
	protected String name;
	protected Approver nextApprover;
	
	public Approver() {
	}

	public Approver(String name) {
		this.name = name;
	}
	
	public Approver(String name, Approver nextApprover) {
		this.name = name;
		this.nextApprover = nextApprover;
	}

	public boolean isTask(String task) {
		return Arrays.asList("ADD", "MOD", "DEL").contains(task);
	}
	
	public abstract void approve(String task);
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Approver getNextApprover() {
		return nextApprover;
	}

	public void setNextApprover(Approver nextApprover) {
		this.nextApprover = nextApprover;
	}
}