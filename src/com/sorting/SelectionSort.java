/**
 * 
 */
package com.sorting;

/**
 * @author Naresh_Chinthakindi
 *
 */
public class SelectionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Least element will move to zeroth index and so on...
		//Time Complexity: O(n2) as there are two nested loops.
		int a[] = {89,349,28,10,4,3,5,6345,43};
		
		for(int index = 0; index < a.length; index++) {
			
			int temp = a[index];
			
			for(int indexj = index+1; indexj < a.length; indexj++) {
				
				if(temp > a[indexj]) {
					temp = a[indexj];
					swap(a, indexj, index);
				}
			}
		}
		
		for(int index = 0; index < a.length; index++) {
			
			System.out.print(a[index] + " ");
		}

	}

	private static void swap(int[] a, int indexj, int index) {
		
		int temp = a[indexj];
		a[indexj] = a[index];
		a[index] = temp;
		
	}

}
