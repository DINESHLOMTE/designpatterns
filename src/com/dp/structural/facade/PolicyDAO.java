/**
 * 
 */
package com.dp.structural.facade;

/**
 * @author dinesh.lomte
 *
 */
public class PolicyDAO {
	
	/**
	 * 
	 */
	public PolicyDAO() {
	}
	
	/**
	 * 
	 * @param number
	 * @return
	 */
	public Policy getEntity(String number) {
		return new Policy("Policy Details of Policy Number: " + number);
	}
}