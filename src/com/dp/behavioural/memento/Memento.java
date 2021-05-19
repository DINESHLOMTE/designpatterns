package com.dp.behavioural.memento;

public class Memento {
	
	private String status;
	
	public Memento() {
	}
	
	public Memento(String status) {
		this.status = status;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
}