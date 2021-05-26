/**
 * 
 */
package com.dp.behavioural.command;

import java.util.Arrays;

/**
 * @author dinesh.lomte
 *
 */
public class Manager extends Approver {
	
	public Manager() {
	}
	
	public Manager(String name) {
		super(name);
	}
	
	@Override
	public void approve(String request) {
		if (!isTask(request) || !Arrays.asList("DEL").contains(request)) {
			return;
		}
		System.out.println("Manager '" + name + "' approving the '" 
				+ request + "' request.");
	}
}