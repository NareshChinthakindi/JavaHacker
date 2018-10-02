/**
 * 
 */
package com.daimond;

/**
 * @author Naresh
 *
 */
public interface XpActual extends APActual{
	
	
	
	@Override
	default void m1() {
		System.out.println("X");
	}

}
