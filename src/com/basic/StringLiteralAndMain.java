/**
 * 
 */
package com.basic;

import java.util.HashMap;

/**
 * @author Naresh_Chinthakindi
 *
 */
public class StringLiteralAndMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "abcde";
		String s2 = new String("abcde");
		String s3 = "abcde";
		
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s2));
		
		HashMap j;
	}

}
