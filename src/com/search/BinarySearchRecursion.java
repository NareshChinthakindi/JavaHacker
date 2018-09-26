/**
 * 
 */
package com.search;

/**
 * @author Naresh_Chinthakindi
 *
 */
public class BinarySearchRecursion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		
		BinarySearchRecursion ob = new BinarySearchRecursion(); 
        int arr[] = {2,3,4,10,40}; 
        int n = arr.length; 
        int elementTobeSearch = 55; 
        int left = 0;
        int right = n-1;
        int result = ob.binarySearch(arr, left ,right, elementTobeSearch); 
        if (result == -1) 
            System.out.println("Element not present"); 
        else
            System.out.println("Element found at index " +  
                                                 result); 

	}

	private int binarySearch(int[] arr, int left, int right, int x) {
		
		if(right >= left) {
			
			int mid = left+(right-left)/2;
			
			if (arr[mid] == x) {
				return mid;
			} 
			
			if(arr[mid] > x){
				return binarySearch(arr, left, mid-1, x);
			} 
				
			
			return binarySearch(arr, mid +1, right, x);
			
				
		}
			return -1;
			
	}

}
