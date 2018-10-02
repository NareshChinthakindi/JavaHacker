/**
 * 
 */
package com.basic.strings;

/**
 * @author Naresh
 *
 */
public class StringReverse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		String str = "Geek interview";
		
		byte [] bytes = str.getBytes();
		
		byte []reversBytes = new byte[bytes.length];
		
		for(int index = 0; index < bytes.length; index++) {
			reversBytes[index] = bytes[bytes.length-index-1];
		}
		
		
		System.out.println(new String(reversBytes));

	}

}
