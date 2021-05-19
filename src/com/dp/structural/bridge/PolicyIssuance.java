package com.dp.structural.bridge;

public class PolicyIssuance extends AbstractPolicy {
	
	public PolicyIssuance() {
	}
	
	public PolicyIssuance(IPolicy iPolicy) {
		super(iPolicy);
	}
	
	public void issuance() {
		System.out.println("Policy Issuance Details");
		System.out.println("--------------------------------------------------");
		System.out.println("Issuing - " + iPolicy.getPolicy());
	}
}