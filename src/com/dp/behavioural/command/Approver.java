/**
 * 
 */
package com.dp.behavioural.command;

import java.util.Arrays;

/**
 * @author dinesh.lomte
 *
 */
public abstract class Approver {
	
	protected String name;

	public Approver() {
	}
	
	public Approver(String name) {
		this.name = name;
	}

	public boolean isTask(String request) {
		return !(request == null || request.trim().isEmpty()
				|| !Arrays.asList("ADD", "MOD", "DEL").contains(request));
	}
	
	public abstract void approve(String request);
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}	
}