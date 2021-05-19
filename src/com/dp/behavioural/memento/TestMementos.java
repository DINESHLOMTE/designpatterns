package com.dp.behavioural.memento;

public class TestMementos {
	public static void main(String[] args) {
		Caretaker caretaker = new Caretaker();
		Originator originator = new Originator("Quote");
		caretaker.add(originator.save());
		
		originator = new Originator("Policy Details");
		caretaker.add(originator.save());
		
		originator = new Originator("Policy Holder Details");
		caretaker.add(originator.save());
		
		originator = new Originator("Policy Issuance");
		caretaker.add(originator.save());
		
		originator = new Originator("Payment Details");
		caretaker.add(originator.save());
		
		originator.restore(caretaker.get(5));
	}
}