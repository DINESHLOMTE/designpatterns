/**
 * 
 */
package com.dp.behavioural.command;

import java.util.List;

/**
 * @author dinesh.lomte
 *
 */
public enum ApproverCommand {
	
	INSTANCE;
	
	private ApproverCommand() {
	}
	
	public static ApproverCommand getInstance() {
		return INSTANCE;
	}
	
	public void approve(List<Approver> approvers, String request) {		
		for (Approver approver : approvers) {
			if (!approver.isTask(request)) {
				System.out.println("Invalid request type '" + request + "'.");
				return;
			}
			approver.approve(request);
		}
	}
}