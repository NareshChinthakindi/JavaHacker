/**
 * 
 */
package com.sorting;

/**
 * @author Naresh_Chinthakindi
 *
 */
public class BubbleSorting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Max element will move to zeroth index and so on...
				//Time Complexity: O(n*n) as there are two nested loops.
				int a[] = {89,349,28,10,4,3,5,6345,43};
				
				
				for(int index = 0; index< (a.length-1); index++) {
					
					
					 for(int indexj =0; indexj<(a.length-(index-1)); indexj++) {
						 
						 if((indexj+1) < a.length && a[indexj] > a[indexj+1] ) {
							swap(a, indexj,indexj+1); 
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
