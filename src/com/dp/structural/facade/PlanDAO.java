/**
 * 
 */
package com.dp.structural.facade;

/**
 * @author dinesh.lomte
 *
 */
public class PlanDAO {
	
	/**
	 * 
	 */
	public PlanDAO() {
	}
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	public Plan getEntity(String id) {
		return new Plan("Plan Details of Plan Id: " + id);
	}
}