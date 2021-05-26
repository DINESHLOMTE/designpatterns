/**
 * 
 */
package com.dp.behavioural.command;

import java.util.Arrays;

/**
 * @author dinesh.lomte
 *
 */
public class Operator extends Approver {
	
	public Operator() {
	}
	
	public Operator(String name) {
		super(name);
	}
	
	@Override
	public void approve(String request) {
		if (!isTask(request)) {
			return;
		}
		if (Arrays.asList("ADD").contains(request)) {
			System.out.println("Operator '" + name + "' approving the '" 
					+ request + "' request.");
		}
	}
}