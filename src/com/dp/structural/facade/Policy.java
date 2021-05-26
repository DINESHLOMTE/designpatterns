/**
 * 
 */
package com.dp.structural.facade;

/**
 * @author dinesh.lomte
 *
 */
public class Policy {	
	
	private String value;
	private PolicyHolder policyHolder;
	private Plan plan;
	private Beneficiary beneficiary;
	
	/**
	 * 
	 */
	public Policy() {
	}
	
	/**
	 * 
	 * @param value
	 */
	public Policy(String value) {
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

	/**
	 * @return the policyHolder
	 */
	public PolicyHolder getPolicyHolder() {
		return policyHolder;
	}

	/**
	 * @param policyHolder the policyHolder to set
	 */
	public void setPolicyHolder(PolicyHolder policyHolder) {
		this.policyHolder = policyHolder;
	}

	/**
	 * @return the plan
	 */
	public Plan getPlan() {
		return plan;
	}

	/**
	 * @param plan the plan to set
	 */
	public void setPlan(Plan plan) {
		this.plan = plan;
	}

	/**
	 * @return the beneficiary
	 */
	public Beneficiary getBeneficiary() {
		return beneficiary;
	}

	/**
	 * @param beneficiary the beneficiary to set
	 */
	public void setBeneficiary(Beneficiary beneficiary) {
		this.beneficiary = beneficiary;
	}
}