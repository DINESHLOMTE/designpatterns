package com.dp.behavioural.observer;

public interface IObserverable {
	
	public void register(IObserver iObserver);
	
	public void notifyAllObservers();
	
	public void setStatus(boolean status);
}