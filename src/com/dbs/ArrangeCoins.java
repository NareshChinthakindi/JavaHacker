package com.dbs;

public class ArrangeCoins {
	public static void arrangeCoins(int length, long[] coins) {
		for (int index = 0; index < coins.length; index++) {
			long d = 1 + (8 * coins[index]);
			System.out.println("d "+d);
			System.out.println(Math.sqrt(d));
			System.out.println((-1 + Math.sqrt(d)));
			System.out.println((-1 + Math.sqrt(d)) / 2);
			long a = (long) Math.floor((-1 + Math.sqrt(d)) / 2);
			System.out.println("Arrange coins problem:" + a);
		}
	}

	public static void main(String[] args) {
		long arrCoins[] = {11 };
		arrangeCoins(arrCoins.length, arrCoins);
	}
}
