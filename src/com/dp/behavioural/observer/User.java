package com.dp.behavioural.observer;

import java.util.Optional;

public class User implements IObserver {
	
	private String name;
	
	public User() {
	}
	
	public User(String name) {
		this.name = name;
	}

	@Override
	public void update(IObserverable iObserverable) {
		Optional.ofNullable(iObserverable).ifPresent(optional -> {
			Product product = (Product) iObserverable;
			if (!product.isStatus()) {
				return;
			}
			System.out.println("Hello '" + name + "', your product '" 
					+ product.getName() + "' is now available in stock.");
		});
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}