package com.dp.behavioural.template;

public abstract class AbstractBase implements IBase {

	public AbstractBase() {
	}
	
	@Override
	public void execute(String type) {
		System.out.println();
		System.out.println("Executing " + type + " process!");
		System.out.println("-----------------------------------------------");
		load();
		process();
		display();
		System.out.println("-----------------------------------------------");
	}
}