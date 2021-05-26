/**
 * 
 */
package com.dp.structural.facade;

/**
 * @author dinesh.lomte
 *
 */
public class PolicyHolderDAO {
	
	/**
	 * 
	 */
	public PolicyHolderDAO() {
	}
	
	/**
	 * 
	 * @param policyNumber
	 * @return
	 */
	public PolicyHolder getEntity(String policyNumber) {
		return new PolicyHolder("PolicyHolder Details of Policy Number: " + policyNumber);
	}
}