/**
 * 
 */
package com.sorting;

/**
 * @author Naresh_Chinthakindi
 *
 */
public class SelectionSortTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Least element will move to zeroth index and so on...
				//Time Complexity: O(n2) as there are two nested loops.
				int a[] = {89,349,28,10,4,3,5,6345,43};
				
	for(int index =0; index<a.length; index++) {
		
		int temp = a[index];
		
		 for(int indexj = index+1; indexj<a.length; indexj++) {
			 
			 if(temp > a[indexj]) {
				 
				 temp = a[indexj];
				 swap(a, index, indexj);
				 
				 
			 }
		 }
	}
	
	for(int index=0; index<a.length; index++) {
		System.out.println(a[index]);
	}

	}

	private static void swap(int[] a, int index, int indexj) {
		
		int temp = a[index];
		
		a[index] = a[indexj];
		a[indexj] = temp;
		
	}

}
