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
 
		//Map<String, Long> eVal = elements.stream().sorted().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		Map<String, Long> eVal = elements.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		Map<String, Long> sorted = new LinkedHashMap<>();
		
		eVal.keySet().stream().sorted().map(String::toString).forEach(k ->{
			sorted.put(k, eVal.get(k));
		});
		
		
		sorted.forEach((k, v) ->{
			System.out.println("K "+k+" v "+v);
		});
		
		//System.out.println(eVal);
		
	}

}
