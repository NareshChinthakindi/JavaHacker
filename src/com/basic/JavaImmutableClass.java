/**
 * 
 */
package com.basic;

/**
 * @author Naresh_Chinthakindi
 *
 */
public final class JavaImmutableClass {
	
	
	private final int i;
	
	public JavaImmutableClass(int i) {
		this.i = i;
	}

	/**
	 * @return the i
	 */
	public int getI() {
		return i;
	}

	/**
	 * @param i the i to set
	 */
	public final void setI(int i) {
	//	this.i = i;//Compile Time error
	}
	
	public static void main(String[] args) {
		
		JavaImmutableClass jic = new JavaImmutableClass(23);
		
		jic.setI(34);
		
		System.out.println(jic.getI());
	}

}
