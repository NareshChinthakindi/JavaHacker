/**
 * 
 */
package com;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Naresh_Chinthakindi
 *
 */
public class HashMapSynchronized {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Map<String, String> valuesWithNames = new HashMap<>();
		
		Collections.synchronizedMap(valuesWithNames);
		
		Map<String, String> table = new ConcurrentHashMap<>();

	}

}
