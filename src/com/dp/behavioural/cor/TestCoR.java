package com.dp.behavioural.cor;

public class TestCoR {
	public static void main(String[] args) {
		Operator operator = new Operator("Mathan");
		Supervisor supervisor = new Supervisor("Murthi");
		operator.setNextApprover(supervisor);
		Manager manager = new Manager("Amar");
		supervisor.setNextApprover(manager);
		
		operator.approve("DEL");
	}
}