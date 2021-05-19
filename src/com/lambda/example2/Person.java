/**
 * 
 */
package com.lambda.example2;

/**
 * @author Dinesh.Lomte
 *
 */
public class Person {
	
	private String firstName;
	private String lastName;
	
	/**
	 * 
	 */
	public Person() {
	}
	
	/**
	 * 
	 * @param firsName
	 * @param lastName
	 */
	public Person(String firsName, String lastName) {
		this.firstName = firsName;
		this.lastName = lastName;
	}
	
	@Override
	public String toString() {
		return "Person Info: [First Name: " + firstName + " - Last Name: " + lastName + "]";
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
