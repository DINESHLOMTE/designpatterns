/**
 * 
 */
package com.dp.structural.facade;

/**
 * @author dinesh.lomte
 *
 */
public enum PolicyHolderFacade {
	
	INSTANCE;
	
	private PolicyHolderFacade() {
	}
	
	public static PolicyHolderFacade getInstance() {
		return INSTANCE;
	}
	
	public PolicyHolder getDetails(String policyNumber) {
		return new PolicyHolderDAO().getEntity(policyNumber);
	}
}