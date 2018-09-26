/**
 * 
 */
package com.dbs;

/**
 * @author Naresh_Chinthakindi
 *
 */
public class BuyingTicketsExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		int[] tickets = { 8, 5, 2, 3 };
		int position = 1;
		System.out.println("numberOfSecondsNeededForPsTickets :" + waitingTime(tickets, position));


	}

	private static int waitingTime(int[] tickets, int position) {
		
		int value = tickets[position];
		
		int result = 0;
		
		for(int index =0; index<=position; index++) {
			
			int temp = tickets[index];
			
			if(temp > value) {
				result = result + value;
			} else {
				result = result + temp;
			}
		}
		
		for(int index = position+1; index < tickets.length; index++) {
			
			int temp = tickets[index];
			
			if(temp > value) {
				result = result + value-1;
			} else {
				result = result + temp;
			}
		}
		
		return result;
	}

}
