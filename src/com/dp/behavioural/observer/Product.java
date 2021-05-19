package com.dp.behavioural.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Product implements IObserverable {

	private String name;
	private boolean status;
	private List<IObserver> observers;
	
	public Product() {
	}
	
	public Product(String name) {
		this.name = name;
	}

	@Override
	public void register(IObserver iObserver) {
		Optional.ofNullable(iObserver).ifPresent(optional -> getObservers().add(iObserver));
	}
	
	@Override
	public void notifyAllObservers() {
		if (getObservers().isEmpty()) {
			System.out.println("Sorry no observers exist to notify!");
			return;
		}
		getObservers().forEach(iObserver -> iObserver.update(this));
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isStatus() {
		return status;
	}

	@Override
	public void setStatus(boolean status) {
		this.status = status;
		if (!this.status) {
			return;
		}
		notifyAllObservers();
	}

	public List<IObserver> getObservers() {
		return (observers == null) ? observers = new ArrayList<>() : observers;
	}

	public void setObservers(List<IObserver> observers) {
		this.observers = observers;
	}
}