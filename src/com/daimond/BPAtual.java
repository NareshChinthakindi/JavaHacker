/**
 * 
 */
package com.daimond;

/**
 * @author Naresh
 *
 */
public interface BPAtual extends APActual{
	
	
	
	@Override
	default void m1() {
		System.out.println("B");
	}
	

}
