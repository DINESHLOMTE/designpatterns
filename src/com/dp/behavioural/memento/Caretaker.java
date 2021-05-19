package com.dp.behavioural.memento;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Caretaker {
	
	private List<Memento> mementos;
	
	public Caretaker() {
	}

	public void add(Memento memento) {
		Optional.ofNullable(memento).ifPresent(
				optional -> getMementos().add(memento));
	}

	public Memento get(int index) {
		if (index > getMementos().size() - 1) {
			return null;
		}
		return getMementos().get(index);
	}
	
	public List<Memento> getMementos() {
		return (mementos == null) ? mementos = new ArrayList<>() : mementos;
	}

	public void setMementos(List<Memento> mementos) {
		this.mementos = mementos;
	}
}