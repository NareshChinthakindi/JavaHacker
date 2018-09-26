/**
 * 
 */
package hacker;

/**
 * @author Naresh_Chinthakindi
 *
 */
public class CoinChangeProblem {
	
	
	public static void main(String[] args) {
		
		int S[] = {1,2,3,4};
		int m = S.length;
		int n = 5;
		int table[]=new int[n+1]; 
		  
	    // Base case (If given value is 0) 
	    table[0] = 1; 
	  
	    // Pick all coins one by one and update the table[] values 
	    // after the index greater than or equal to the value of the 
	    // picked coin 
	    for(int i=0; i<m; i++) {
	    	for(int j=S[i]; j<=n; j++) {
	    		table[j] += table[j-S[i]]; 
	    	//	System.out.println(j +" table "+table[j]);
	    	}
	    }
	  
	    System.out.println(table[n]);
	}

}
