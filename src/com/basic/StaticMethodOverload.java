/**
 * 
 */
package com.basic;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author Naresh
 *
 */
public class StaticMethodOverload {

	
	private String naresh;
	
	static {
		//naresh = naresh;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			 
LinkedList test;		
		} catch(Exception e) {
			e.printStackTrace();
		} /*catch(RuntimeException ep) {
			ep.printStackTrace();
		}*/
	}

	
	
	public static void test() {
		
		//System.out.println(naresh); You cannot access non-static memeber variable from
		//satic context;[eventually it will generate the compilation error]
	}
	
    public static void test(String naresh) {
		
	}
}
