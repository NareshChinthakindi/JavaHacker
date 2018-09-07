package com.dbs;

public class IronMan {

	public static int ironManFunction(int arr[]) {
		int charge = 1;
		int temp = charge;
		for (int i = 0; i < arr.length; i++) {
			temp += arr[i];
			if (arr[i] < 0 && (temp < 1)) {
				charge = 1 - temp + charge;
				temp = 1;
			}
		}
		System.out.println(charge);
		return charge;
	}

	public static void main(String[] args) {

		int arr[] = { -5, 4, -2, 3, 1, -1, -6, -1, 0, 5 };
		int arr1[] = { -5, 4, -2, 3, 1 };
		int arr2[] = { -5, 4, -2, 3, 1, -1, -6, -1, 0, -5 };
		ironManFunction(arr);
		ironManFunction(arr1);
		ironManFunction(arr2);
	}
}
