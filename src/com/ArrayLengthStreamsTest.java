/**
 * 
 */
package com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Naresh_Chinthakindi
 *
 */
public class ArrayLengthStreamsTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<String> elements = Arrays.asList("Naresh", "Suresh", "Ramesh", "Gopal");
		
		List<Integer> elementsLength = elements.stream().map(String::length).collect(Collectors.toList());
	
		elementsLength.forEach(System.out::println);
		
		
	}

}
