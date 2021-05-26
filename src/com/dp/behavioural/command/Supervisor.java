/**
 * 
 */
package com.dp.behavioural.command;

import java.util.Arrays;

/**
 * @author dinesh.lomte
 *
 */
public class Supervisor extends Approver {
	
	public Supervisor() {
	}
	
	public Supervisor(String name) {
		super(name);
	}
	
	@Override
	public void approve(String request) {
		if (!isTask(request) || !Arrays.asList("MOD").contains(request)) {
			return;
		}
		System.out.println("Supervisor '" + name + "' approving the '" 
				+ request + "' request.");
	}
}