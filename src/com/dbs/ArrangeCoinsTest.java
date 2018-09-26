/**
 * 
 */
package com.dbs;

/**
 * @author Naresh_Chinthakindi
 *
 */
public class ArrangeCoinsTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		
		System.out.println("Enter total number of coins");
		if(scanner.hasNext()) {
		int totalCounts = scanner.nextInt();
		
		 int coins[] = new int[totalCounts];
		 
		 for(int index = 0; index<coins.length; index++) {
			 
			 coins[index] = scanner.nextInt();
			 
		 }
		 
		 scanner.close();
		 
		 for(int index =0; index<coins.length; index++) {
			 
			 System.out.println(numberOfWaysWeCanArray(coins[index]));
			 
		 }
		
		
		}
		

	}

	private static long numberOfWaysWeCanArray(int coin) {
		
	 long d = 1 + 8 *coin;
	 
	 long val = (long) Math.floor((-1+Math.sqrt(d))/2);
		return val;
	}

}
