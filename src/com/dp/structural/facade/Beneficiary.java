/**
 * 
 */
package com.dp.structural.facade;

/**
 * @author dinesh.lomte
 *
 */

public class Beneficiary {	
	
	private String value;
	
	/**
	 * 
	 */
	public Beneficiary() {
	}

	/**
	 * 
	 * @param value
	 */
	public Beneficiary(String value) {
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