/**
 * 
 */
package com.dbs;

import java.util.Scanner;

/**
 * @author Naresh_Chinthakindi
 *
 */
public class KeyBoardTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int a[] = {4,2,3,6,9,2};
		
		//System.out.println("Enter the values");
		int keyboard[][] = new int[3][3];
		//Scanner scanner = new Scanner(System.in);
		String keypad = "923857614";
		int z=0;
		for(int indexX=0; indexX<3; indexX++) {
			 for(int indexY=0; indexY<3; indexY++) {
				 keyboard[indexX][indexY] = Integer.parseInt(String.valueOf(keypad.charAt(z)));
				 z++;
			 }
		}
		
		//scanner.close();
		
		int time = 0;
		int current = a[0];
		for(int index =1; index < a.length; index++) {
			time = time + calculateTime(a[index], keyboard, current);
			current = a[index];
		}

		System.out.println("time "+time);
	}

	private static int calculateTime(int nextVale, int[][] keyboard, int current) {
		int result = 0;
		
		if(current != nextVale) {
			
			for(int indexX=0; indexX<3; indexX++) {
				 for(int indexY=0; indexY<3; indexY++) {
					 
					 if (current == keyboard[indexX][indexY]) {
						 
						 if(indexX-1 >= 0) {
							 
							 if (nextVale == keyboard[indexX-1][indexY] 
									 || (indexY-1 >=0 && nextVale == keyboard[indexX-1][indexY-1])
									 || (indexY+1 <3 && nextVale == keyboard[indexX-1][indexY+1])) {
								 result = 1;
							 } 
						 } else if(indexX+1 <3) {
							
							 if (nextVale == keyboard[indexX+1][indexY] 
									 || (indexY-1 >=0 && nextVale == keyboard[indexX+1][indexY-1])
									 || (indexY+1 <3 && nextVale == keyboard[indexX+1][indexY+1])) {
								 result = 1;
							 } 
						 } else {
							 result = 2;
						 }
					 }
				 }
			}
			
		}
		
		return result;
	}

}
