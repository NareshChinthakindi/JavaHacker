package com;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ArrayElementsCountWithKeySortingTest {
	
	public static void main(String[] args) {
		
		
		
		List<String> elements = Arrays.asList("Naresh", "Suresh", "Ramesh", "Gopal", "ANaresh", "BNaresh", "Gopal");
 
		Map<String, Long> elementsWithCount = elements.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		Map<String, Long> sortedElementsWithCount = new LinkedHashMap<>();
		
		elements.stream().sorted().forEach( key ->{
			
			sortedElementsWithCount.put(key, elementsWithCount.get(key));
		});
		
		
		sortedElementsWithCount.forEach((k,v) ->{
			System.out.println(k+" "+v);
		});
		
	}

}
