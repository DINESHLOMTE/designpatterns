package com.dp.structural.flyweight;

public class Employee {
	
	private int id;
	private IDivision iDivision;
	
	public Employee() {
	}
	
	public Employee(int id, IDivision iDivision) {
		this.id = id;
		this.iDivision = iDivision;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public IDivision getiDivision() {
		return iDivision;
	}

	public void setiDivision(IDivision iDivision) {
		this.iDivision = iDivision;
	}
}