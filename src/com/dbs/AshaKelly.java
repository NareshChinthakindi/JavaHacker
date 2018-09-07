package com.dbs;

public class AshaKelly {

	public static int minNum(int a, int k, int p) {
		if (a + p < k)
			return 1;
		else if (a + p == k)
			return 2;
		else {
			int temp = a + p;
			int kelly = k;
			int day = 1;
			while (temp > kelly) {
				temp = temp + a;
				kelly = kelly + k;
				day++;
				if (day > 100)
					return -1;

			}
			return day;
		}

	}

	public static void main(String[] args) {

		int minNum1 = minNum(3, 5, 1);
		int minNum2 = minNum(4, 5, 1);
		// int minNum3 = minNum(5,4,1);
		int minNum3 = minNum(10, 4, 1);
		System.out.println(" minNum1 is " + minNum1);
		System.out.println(" minNum2 is " + minNum2);
		System.out.println(" minNum3 is " + minNum3);
	}

}
