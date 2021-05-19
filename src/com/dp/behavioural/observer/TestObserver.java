package com.dp.behavioural.observer;

public class TestObserver {
	public static void main(String[] args) {
		IObserverable iObserverable = new Product("Moto G5 Plus");
		
		iObserverable.register(new User("dlomte"));
		
		iObserverable.setStatus(true);
	}
}