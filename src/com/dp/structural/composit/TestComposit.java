package com.dp.structural.composit;

public class TestComposit {
	public static void main(String[] args) {
		EmployeeComposit employeeComposit = new EmployeeComposit();
		
		Employee employee1 = new Employee("1", "ONE", false);
		employeeComposit.add(employee1);
		
		Employee employee2 = new Employee("2", "TWO", false);
		employeeComposit.addReportee(employee1, employee2);
		
		Employee employee3 = new Employee("3", "THREE", false);
		employeeComposit.addReportee(employee1, employee3);
		
		Employee employee4 = new Employee("4", "FOUR", false);
		employeeComposit.addReportee(employee2, employee4);
		
		Employee employee5 = new Employee("5", "FIVE", false);
		employeeComposit.addReportee(employee3, employee5);
		
		Employee employee6 = new Employee("6", "SIX", false);
		employeeComposit.addReportee(employee5, employee6);
		
		Employee employee7 = new Employee("7", "SEVEN", true);
		employeeComposit.addReportee(employee6, employee7);
		
		Employee employee8 = new Employee("8", "EIGHT", true);
		employeeComposit.addReportee(employee7, employee8);		
		// Displaying the complete tree
		employeeComposit.display();
		// Display the tree specific to particular object
		// employeeComposit.display(employee5);
	}
}