package com.dbs;

public class BitGame {

	public static int maxXor(int left, int right, int k) {
		int maxNum = 0;
		int xorVal = 0;
		if (left == right)
			return 0;
		else if (left > right)
			return maxXor(right, left, k);
		else {
			for (int i = left; i < right; i++) {
				for (int j = left + 1; j <= right; j++) {
					xorVal = i ^ j;
					if (xorVal > maxNum && xorVal <= k)
						maxNum = xorVal;
				}
			}
			return maxNum;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max1 = maxXor(1, 3, 3);
		int max2 = maxXor(2, 4, 8);
		int max = maxXor(2, 6, 9);
		int max3 = maxXor(4, 2, 8);
		int max4 = maxXor(1, 1, 3);
		System.out.println(" max Value is :" + max);
		System.out.println(" max1 Value is :" + max1);
		System.out.println(" max2 Value is :" + max2);
		System.out.println(" max3 Value is :" + max3);
		System.out.println(" max4 Value is :" + max4);

	}

}
