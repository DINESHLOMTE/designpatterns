/**
 * 
 */
package com.dp.structural.facade;

/**
 * @author dinesh.lomte
 *
 */
public class TestFacade {
	public static void main(String[] args) {
		
		Policy policy = new PolicyDetails().getPolicyDetails("1000001");
		System.out.println("Policy Details:        | " + policy.getValue());
		System.out.println("-------------------------------------------------");
		System.out.println("Plan Details:          | " + policy.getPlan().getValue());
		System.out.println("-------------------------------------------------");
		System.out.println("Policy Holder Details: | " + policy.getPolicyHolder().getValue());
		System.out.println("-------------------------------------------------");
		System.out.println("Benificiary Details:   | " + policy.getBeneficiary().getValue());
	}
}