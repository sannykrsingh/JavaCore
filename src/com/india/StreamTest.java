package com.india;

import java.util.*;
import java.util.stream.Stream;

public class StreamTest {
	public static void main(String[] args) {
		
		
		Stream<String> stream= Stream.of("sanny","is","good","boy");
		
		stream.map(String::toUpperCase).peek(s ->System.out.println(s));
		
		
		//stream.forEach(i -> System.out.println(i));
	//	stream.forEach(System.out::println);
		//stream.map(i)
		
		 /* List<String> numbers = Arrays.asList("1", "2", "3", "4", "5", "6");
		  
		 List s= (List) numbers.stream().map(i ->Integer.valueOf(i));
		 System.out.println(s);*/
	}
}
