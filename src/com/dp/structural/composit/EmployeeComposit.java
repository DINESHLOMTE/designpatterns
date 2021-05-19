package com.dp.structural.composit;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EmployeeComposit implements IEmployeeComposit {
	
	private List<Employee> employees;
	
	public EmployeeComposit() {
	}

	public List<Employee> getEmployees() {
		return (employees == null) ? 
				employees = new ArrayList<Employee>() : employees;
	}

	@Override
	public void add(Employee employee) {
		Optional.ofNullable(employee).ifPresent(
				optional -> getEmployees().add(employee));
	}
	
	@Override
	public void addReportee(Employee employee, Employee reportee) {
		Optional.ofNullable(employee).ifPresent(optEmployee -> {
			if (employee.isLeaf()) {
				System.out.println("Employee " + employee.getId() 
					+ " is a leaf node cannot add reportees!");
				return;
			}
			Optional.ofNullable(reportee).ifPresent(optReportee -> 
				employee.getReportees().add(reportee));
		});
	}
	
	@Override
	public void display() {
		if (getEmployees().isEmpty()) {
			System.out.println("No employees exist!");
			return;
		}
		getEmployees().forEach(employee -> display(employee));
	}
	
	@Override
	public void display(Employee employee) {
		Optional.ofNullable(employee).ifPresent(optional -> {
			System.out.println("ID:   " + optional.getId());
			System.out.println("Name: " + optional.getName());
			if (optional.isLeaf()) {
				System.out.println("Is a leaf node.");
				System.out.println("-------------------------------------------------");
				return;
			}
			if (optional.getReportees().isEmpty()) {
				System.out.println("No reportees exists!");
				System.out.println("-------------------------------------------------");
				return;
			}
			employee.getReportees().forEach(reportee -> {
				System.out.println("Reportees of ID: " + employee.getId());
				System.out.println("-------------------------------------------------");
				display(reportee);
			});
		});
	}
	
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
}