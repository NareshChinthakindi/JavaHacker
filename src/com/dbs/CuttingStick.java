package com.dbs;

import java.util.Arrays;

public class CuttingStick {
	
	public static void main(String[] args) {
		//int arr[] = {5, 4 ,4, 2, 2, 8};
		int arr[] = {1, 2, 3, 4, 3, 3, 2, 1};
		int n = arr.length;
        
        Arrays.sort(arr);
        int min = arr[0];
        for(int i =0; i<n;){
            System.out.println(n-i);
            i++;
            while(i<n && arr[i]==min){
                i++;
            }
            if(i < n)
            min = arr[i];
        }
	}

}
