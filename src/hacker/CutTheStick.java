/**
 * 
 */
package hacker;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Naresh_Chinthakindi
 *
 */
public class CutTheStick {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt(),i;
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        
        in.close();
           Arrays.sort(arr);
           
           System.out.println(n);
           
           for(i=0;i<arr.length-1;i++){
               if(arr[i]!=arr[i+1]) {
            	   System.out.println(n-(i+1));
               }
           }   
	}

}
