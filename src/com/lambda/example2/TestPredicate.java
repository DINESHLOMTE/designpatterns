/**
 * 
 */
package com.lambda.example2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author Dinesh.Lomte
 *
 */
public class TestPredicate {
	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(
				new Person("D", "B"),
				new Person("A", "C"),
				new Person("K", "D"),
				new Person("R", "L"),
				new Person("L", "M"),
				new Person("K", "N"),
				new Person("L", "P"));
		
		Collections.sort(persons, 
				(p1, p2) -> p1.getFirstName().compareTo(p2.getFirstName()));
		
		printCondition(persons, person -> true);
	}
	
	private static void printCondition(List<Person> persons, Predicate<Person> predicate) {
		for (Person p : persons) {
			if (predicate.test(p)) {
				System.out.println(p);
			}
		}
	}
}