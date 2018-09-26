/**
 * 
 */
package com.dbs;

/**
 * @author Naresh_Chinthakindi
 *
 */
public class AshaKellyTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int minNum1 = minNum(3, 5, 1);
		int minNum2 = minNum(4, 5, 1);
		// int minNum3 = minNum(5,4,1);
		int minNum3 = minNum(10, 4, 1);
		System.out.println(" minNum1 is " + minNum1);
		System.out.println(" minNum2 is " + minNum2);
		System.out.println(" minNum3 is " + minNum3);

	}

	private static int minNum(int a, int k, int p) {
		int days = 1;
		if(a > k) {
			return -1;
		} else if(a + p == k) {
			return 2;
		} else if (a+p < k) {
			return 1;
		} else {
			
			int temp = a + p;
			int kelly = k;
			while (temp > kelly && days < 101) {
				 temp = temp + a;
				 kelly = kelly + k;
				 days++;
			}
		}
		
		
		return days;
	}

}
