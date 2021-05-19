package com.dp.structural.composit;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	
	private String id;
	private String name;
	private boolean leaf;
	private List<Employee> reportees;
	
	public Employee() {
	}
	
	public Employee(String id, String name, boolean leaf) {
		this.id = id;
		this.name = name;
		this.leaf = leaf;
		if (!this.leaf) {
			getReportees();
		}
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isLeaf() {
		return leaf;
	}

	public void setLeaf(boolean leaf) {
		this.leaf = leaf;
	}

	public List<Employee> getReportees() {
		return (reportees == null) ? 
				reportees = new ArrayList<Employee>() : reportees;
	}

	public void setReportees(List<Employee> reportees) {
		this.reportees = reportees;
	}
}