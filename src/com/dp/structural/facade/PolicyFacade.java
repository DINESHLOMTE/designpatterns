/**
 * 
 */
package com.dp.structural.facade;

/**
 * @author dinesh.lomte
 *
 */
public enum PolicyFacade {
	
	INSTANCE;
	
	private PolicyFacade() {
	}
	
	public static PolicyFacade getInstance() {
		return INSTANCE;
	}
	
	public Policy getPolicyDetails(String number) {
		Policy policy = new PolicyDAO().getEntity(number);
		policy.setPolicyHolder(PolicyHolderFacade.getInstance().getDetails(number));
		policy.setBeneficiary(BeneficiaryFacade.getInstance().getDetails(number));
		policy.setPlan(PlanFacade.getInstance().getDetails("P10001"));
		return policy;
	}
}