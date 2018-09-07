/**
 * 
 */
package com.model;

/**
 * @author Naresh_Chinthakindi
 *
 */
public class KPallandromeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String text = "abcba";
		
		int k = 4;
		
		boolean result = isKPallandrome(text, k-1);
		
		System.out.println(result);

	}

	
	
	private static boolean isKPallandrome(String text, int k) {
		
		if(text.length() <2) {
			return true;
		}
		
		if(text.charAt(0) == text.charAt(text.length()-1)) {
			return isKPallandrome(text.substring(1, text.length()-1), k);
		} else {
			
			if(k ==0) {
				return false;
			} else {
				if(isKPallandrome(text.substring(0, text.length()-1), k-1)) {
					return true;
				}
				else {
					return isKPallandrome(text.substring(1, text.length()), k-1);
				}
			}
		}
	}

}
