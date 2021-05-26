/**
 * 
 */
package com.dp.behavioural.command;

import java.util.Arrays;

/**
 * @author dinesh.lomte
 *
 */
public class TestCommand {
	
	public static void main(String[] args) {
		
		ApproverCommand.getInstance().approve(Arrays.asList(
				new Operator("Mathan"), 
				new Supervisor("Murthy"), 
				new Manager("Amar")), "DEL");
	}
}