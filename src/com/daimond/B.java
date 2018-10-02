/**
 * 
 */
package com.daimond;

/**
 * @author Naresh
 *
 */
public class B implements X, A{

	@Override
	public void m1() {
		X.super.m1();
		System.out.println("M2");
	}

}
