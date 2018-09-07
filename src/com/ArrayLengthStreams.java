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
public class ArrayLengthStreams {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<String> elements = Arrays.asList("Naresh", "Suresh", "Ramesh", "Gopal");
		List<Integer> elementsLenghts = elements.stream().map(String::length).collect(Collectors.toList());
        elementsLenghts.forEach(System.out::println);
		
		
	}

}
