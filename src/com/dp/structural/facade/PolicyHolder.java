/**
 * 
 */
package com.dp.structural.facade;

/**
 * @author dinesh.lomte
 *
 */

public class PolicyHolder {
	
	private String value;
	
	/**
	 * 
	 */
	public PolicyHolder() {
	}
	
	/**
	 * 
	 * @param value
	 */
	public PolicyHolder(String value) {
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