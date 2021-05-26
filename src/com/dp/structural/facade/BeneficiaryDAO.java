/**
 * 
 */
package com.dp.structural.facade;

/**
 * @author dinesh.lomte
 *
 */
public class BeneficiaryDAO {
	
	public BeneficiaryDAO() {
	}
	
	public Beneficiary getEntity(String policyNumber) {
		return new Beneficiary("Beneficiary Details of Policy Number: " + policyNumber);
	}
}