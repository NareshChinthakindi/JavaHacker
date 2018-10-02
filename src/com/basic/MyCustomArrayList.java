/**
 * 
 */
package com.basic;

import java.util.Arrays;

/**
 * @author Naresh_Chinthakindi
 *
 */
public class MyCustomArrayList<T> {
	
	
	private static final int SIZE_FACTOR = 5;
	
    private Object data[];
	
	private int index;
	
	private int size;
	
	public MyCustomArrayList() {
		data = new Object[SIZE_FACTOR];
		size = SIZE_FACTOR;
	}
	
	
	public boolean add(T v) {
		
		boolean result = false;
		
		if(this.index == size) {
			data = Arrays.copyOf(data, this.index + SIZE_FACTOR);
		}
		
		data[this.index] = v;
		this.index++;
		result = true;
		return result;
		
	}
	
	public T get(int index) {
		return (T) data[index];
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		MyCustomArrayList<String> values = new MyCustomArrayList<>();
		
		values.add("Naresh");
		
		values.add("Ramesh");
		
		System.out.println(values.get(1));

	}
	
	

}
