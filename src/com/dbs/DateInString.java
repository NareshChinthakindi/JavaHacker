/**
 * 
 */
package com.dbs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Naresh_Chinthakindi
 *
 */
public class DateInString {
	
	private static Pattern DATE_PATTERN = Pattern.compile(
		      "\\d{2}-\\d{2}-\\d{4}");
	
	public static void main(String[] args) {
		
		String value = "start by creating a very simple prototype 09-09-2019 and 07-02-2000";
		
	 Matcher matcher =	DATE_PATTERN.matcher(value);
	 
	 while(matcher.find()) {
		 System.out.println(matcher.group());
	 }
	 
	
	}

}
