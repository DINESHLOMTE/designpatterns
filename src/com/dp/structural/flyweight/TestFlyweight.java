package com.dp.structural.flyweight;

public class TestFlyweight {
	public static void main(String[] args) {
		DivisionFlyweight divisionFlyweight = new DivisionFlyweight();
		
		new Employee(1, divisionFlyweight.getDivision("APP"));
		new Employee(2, divisionFlyweight.getDivision("APP"));
		new Employee(3, divisionFlyweight.getDivision("HR"));
		new Employee(4, divisionFlyweight.getDivision("APP"));
		new Employee(5, divisionFlyweight.getDivision("APP"));
		
		System.out.println(divisionFlyweight.getDivisions().size());	
	}
}