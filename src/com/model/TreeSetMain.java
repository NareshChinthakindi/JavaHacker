/**
 * 
 */
package com.model;

import java.util.Set;
import java.util.TreeSet;

/**
 * @author Naresh_Chinthakindi
 *
 */
public class TreeSetMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		Employee emp1 = new Employee(1, "Naresh", "Chinthakindi");
		
		Employee emp2 = new Employee(2, "Naresh", "Chinthakindi");
		
		Set<Employee> sets = new TreeSet<>();
		
		sets.add(emp2);
		sets.add(emp1);
		
		sets.forEach(e ->{
			System.out.println(e.toString());
		});

	}

}
