package com.dbs;

public class KeyBoard {

	private static int[][] array = new int[3][3];

	public static int entryTime(String entry, String keypad) {

		if (keypad.length() != 9)
			System.out.println("Invalid keypad.");

		int z = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				array[i][j] = keypad.charAt(z);
				z++;
			}
		}
		int time = 0;
		int current = 0;
		for (int i = 0; i < entry.length(); i++) {
			if (i == 0) {
				current = entry.charAt(i);
				continue;
			}

			if (current != entry.charAt(i)) {
				time += calculateTime(current, entry.charAt(i));
			}

			current = entry.charAt(i);
		}

		return time;
	}

	private static int calculateTime(int a, int b) {
		int currentPositionX = 0;
		int currentPositionY = 0;
		int nextPositionX = 0;
		int nextPositionY = 0;
		int time = 0;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (a == array[i][j]) {
					currentPositionX = i;
					currentPositionY = j;
				} else if (b == array[i][j]) {
					nextPositionX = i;
					nextPositionY = j;
				}
			}
		}

		int xDiff = currentPositionX - nextPositionX;
		int yDiff = currentPositionY - nextPositionY;

		if (xDiff == 0 && yDiff == 0) {
			time = 0;
		} else if ((xDiff == 1 || xDiff == -1) && (yDiff == 1 || yDiff == -1)) {
			time = 1;
		} else if ((xDiff == 1 || xDiff == -1) && (yDiff == 2 || yDiff == -2)) {
			time = 2;
		} else if ((xDiff == 2 || xDiff == -2) && (yDiff == 1 || yDiff == -1)) {
			time = 2;
		} else if (xDiff == 0 && (yDiff == 2 || yDiff == -2)) {
			time = 2;
		} else if (yDiff == 0 && (xDiff == 2 || xDiff == -2)) {
			time = 2;
		} else if (xDiff == 0 && (yDiff == 1 || yDiff == -1)) {
			time = 1;
		} else if ((xDiff == 1 || xDiff == -1) && yDiff == 0) {
			time = 1;
		} else if ((xDiff == 2 || xDiff == -2) && (yDiff == 2 || yDiff == -2)) {
			time = 2;
		} else {
			time = 0;
		}

		return time;
	}

	public static void main(String[] args) {

		System.out.println(entryTime("423692", "923857614"));
		System.out.println(entryTime("5111", "752961348"));
		System.out.println(entryTime("91566165", "639485712"));
	}
}
