/**
 * 
 */
package com.lambda.example1;

/**
 * @author Dinesh.Lomte
 *
 */
public class FindLength {
	
	public static void main(String[] args) {
		
		printLambdaStringLength(value -> value.length());
		
	}
	
	public static void printLambdaStringLength(IStringLength iStringLength) {
		System.out.println(iStringLength.getLength("Hello World!"));
	}
}
