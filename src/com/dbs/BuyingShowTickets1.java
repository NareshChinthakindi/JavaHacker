package com.dbs;

public class BuyingShowTickets1 {

	public static void main(String[] args) {

		int[] tickets = { 8, 5, 2, 3 };
		int position = 1;
		System.out.println("numberOfSecondsNeededForPsTickets :" + waitingTime(tickets, position));
	}

	public static int waitingTime(int[] neededTickets, int position) {
		int numberOfSeconds = 0;

		for (int i = 0; i <= position; i++) {
			if (neededTickets[i] >= neededTickets[position])
				numberOfSeconds = numberOfSeconds + neededTickets[position];
			else
				numberOfSeconds = numberOfSeconds + neededTickets[i];
		}

		
		for (int i = position + 1; i < neededTickets.length; i++) {
			if (neededTickets[i] >= neededTickets[position])
				numberOfSeconds = numberOfSeconds + (neededTickets[position] - 1);
			else
				numberOfSeconds = numberOfSeconds + neededTickets[i];
		}
		return numberOfSeconds;
	}

}
