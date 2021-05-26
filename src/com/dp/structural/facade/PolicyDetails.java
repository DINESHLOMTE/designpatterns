/**
 * 
 */
package com.dp.structural.facade;

/**
 * @author dinesh.lomte
 *
 */
public class PolicyDetails {
	
	public PolicyDetails() {
	}
	
	public Policy getPolicyDetails(String number) {
		return PolicyFacade.getInstance().getPolicyDetails(number);
	}
}