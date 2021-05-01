package com.india;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiTest {
	public static void main(String[] args) {
		
		List<String> ls= new ArrayList<String>();
		ls.add("sanny");
		ls.add("kumar");
		ls.add("singh");
		ls.add("sadhvi");
		ls.add("rani");
		ls.stream().map(i ->i.toUpperCase()).collect(Collectors.toList());
		
		//ls.forEach(i->  System.out.println(i));
		ls.stream().map(i -> i.toUpperCase()).collect(Collectors.toList());
		ls.stream().map(i -> i.toUpperCase()).forEach(i->System.out.println(i));
		
	//	System.out.println(ls.stream().findFirst());
		
	}
}
