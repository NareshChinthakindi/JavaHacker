/**
 * 
 */
package com;

/**
 * @author Naresh_Chinthakindi
 *
 */
public class KPalindromeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		 String str = "d1abcdba1e3";
	        int k = 2;
	        
	        int length = str.length();
	        
	        String reverseString = new StringBuilder(str).reverse().toString();
	        
	        int result = isKPalindrome(str, length, reverseString, length);
	        		
	        		if(result <=2*k) {
	        			System.out.println("Palindrome");
	        		} else {
	        			System.out.println("Not");
	        		}


	}

	
	private static int isKPalindrome(String actual, int m, String reverseString, int n) {
		
		
		  // if either string is empty, remove all characters from other string
        if (m == 0 || n == 0) {
            return n + m;
        }
        
        if(actual.charAt(m-1) == reverseString.charAt(n-1)) {
        	return isKPalindrome(actual, m-1, reverseString, n-1);
        }
        
        
        int x = isKPalindrome(actual, m-1, reverseString, n);
        
        int y= isKPalindrome(actual, m, reverseString, n-1);
		
		return 1 + Integer.min(x, y);
	}

}
