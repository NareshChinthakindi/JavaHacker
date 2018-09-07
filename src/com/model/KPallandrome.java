/**
 * 
 */
package com.model;

/**
 * @author Naresh_Chinthakindi
 *
 */
public class KPallandrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String ab = "abcba";
		
		System.out.println(isKPalindrome(ab, 4-1));

	}
	
	public static boolean isKPalindrome(String str, int k) {
		if(str.length() <2) {
			return true;
		}
		
		if(str.charAt(0) == str.charAt(str.length()-1)) {
			return isKPalindrome(str.substring(1, str.length()-1), k);
		} else {
			if(k == 0) {
				return false;
			}else {
				
				if(isKPalindrome(str.substring(0, str.length()-1), k-1)) {
					return true;
				} else {
					return isKPalindrome(str.substring((1), str.length()), k-1);
				}
			}
		}
	}
	
	/*public static boolean isKPalindrome(String str, int k) {
        if(str.length() < 2) {
            return true;
        }

        if(str.charAt(0) == str.charAt(str.length()-1)) {
            return isKPalindrome(str.substring(1, str.length()-1), k);
        } else{
            if(k == 0) {
                return false;
            } else {
                if(isKPalindrome(str.substring(0, str.length() - 1), k-1)) {                        
                    return true;
                } else{
                    return isKPalindrome(str.substring(1, str.length()), k-1);
                }                   
            }
        }
    }*/

}
