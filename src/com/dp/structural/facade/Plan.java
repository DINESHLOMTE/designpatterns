/**
 * 
 */
package com.dp.structural.facade;

/**
 * @author dinesh.lomte
 *
 */

public class Plan {	
	
	private String value;

	/**
	 * 
	 */
	public Plan() {
	}
	
	/**
	 * 
	 * @param value
	 */
	public Plan(String value) {
		this.value = value;
	}

	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}
}