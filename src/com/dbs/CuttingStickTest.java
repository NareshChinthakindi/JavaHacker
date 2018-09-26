/**
 * 
 */
package com.dbs;

import java.util.Arrays;

/**
 * @author Naresh_Chinthakindi
 *
 */
public class CuttingStickTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int arr[] = {1, 2, 3, 4, 3, 3, 2, 1};
		int n = arr.length;
		Arrays.sort(arr);
		
		int min = arr[0];
		
		for(int index=0; index<n;) {
			
			System.out.println(n-index);
			
			while(index<n && arr[index] == min) {
				index++;
			}
			
			if(index < n) {
				min = arr[index];
			}
		}

	}

}
