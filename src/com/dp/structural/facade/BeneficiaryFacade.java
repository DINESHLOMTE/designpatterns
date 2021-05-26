/**
 * 
 */
package com.dp.structural.facade;

/**
 * @author dinesh.lomte
 *
 */
public enum BeneficiaryFacade {
	INSTANCE;
	
	private BeneficiaryFacade() {
	}
	
	public static BeneficiaryFacade getInstance() {
		return INSTANCE;
	}
	
	public Beneficiary getDetails(String policyNumber) {
		return new BeneficiaryDAO().getEntity(policyNumber);
	}
}