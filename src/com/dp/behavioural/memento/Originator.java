package com.dp.behavioural.memento;

import java.util.Optional;

public class Originator {
	
	private String status;

	public Originator() {
	}

	public Originator(String status) {
		this.status = status;
	}
	
	public Memento save() {
		System.out.println("Saving status - " + status);
		return new Memento(status);
	}
	
	public void restore(Memento memento) {
		if (memento == null) {
			System.out.println("Invalid restore.");
			return;
		}
		Optional.ofNullable(memento).ifPresent(optional -> 
			System.out.println("Restoring status - " + memento.getStatus()));
	}
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}