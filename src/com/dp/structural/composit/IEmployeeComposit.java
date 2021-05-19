package com.dp.structural.composit;

public interface IEmployeeComposit {
	
	public void add(Employee employee);
	public void addReportee(Employee employee, Employee reportee);
	public void display();
	public void display(Employee employee);
}