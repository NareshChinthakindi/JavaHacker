/**
 * 
 */
package com.basic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Naresh
 *
 */
public class StringOccurance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		String in = "i have a male cat. the color of male cat is Black";
		int i = 0;
		Pattern p = Pattern.compile("male cat");
		Matcher m = p.matcher(in);
		while (m.find()) {
		    i++;
		}
		System.out.println(i);

	}

}
