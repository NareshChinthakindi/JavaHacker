/**
 * 
 */
package com.dbs;

import java.util.Arrays;

/**
 * @author Naresh_Chinthakindi
 *
 */
public class DifferenceBetweenMaxAndMinInArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {2,5,3,4,10,6,9,8,1};
		
		Arrays.sort(a);
		
		System.out.println(a[a.length-1]-a[0]);
	}

}
