/**
 * 
 */
package com.basic.strings;

/**
 * @author Naresh
 *
 */
public class StringRemoveDuplicateChars {
	
	public static void main(String[] args) {
	
		System.out.println(removeDuplicates("geeksforgeeks"));
	}
	
	public static String removeDuplicates(String input){
	    String result = "";
	    for (int i = 0; i < input.length(); i++) {
	        if(!result.contains(String.valueOf(input.charAt(i)))) {
	            result += String.valueOf(input.charAt(i));
	        }
	    }
	    return result;
	}

}
