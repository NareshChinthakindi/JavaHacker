/**
 * 
 */
package com.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * @author Naresh_Chinthakindi
 *
 */
public class FileReadingExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String fileName = "d://machine.txt";
      
		try(java.util.stream.Stream<String> stream = Files.lines(Paths.get(fileName))) {
			
			  stream.forEach(System.out::println);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
