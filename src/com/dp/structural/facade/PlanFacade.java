/**
 * 
 */
package com.dp.structural.facade;

/**
 * @author dinesh.lomte
 *
 */
public enum PlanFacade {
	
	INSTANCE;
	
	private PlanFacade() {
	}
	
	public static PlanFacade getInstance() {
		return INSTANCE;
	}
	
	public Plan getDetails(String planId) {
		return new PlanDAO().getEntity(planId);
	}
}