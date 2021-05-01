package com.india;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Java8Test {

	public static void main(String[] args) {
		
		List<String> ls= new ArrayList<String>();

		ls.add("sanny");
		ls.add("rakesh");
		ls.add("kumar");	
		ls.add("singh");
		ls.add("mukesh");
		
		/*ls.stream().forEach((i)->System.out.println(i));
		
		ls.forEach((i)->System.out.println(i));*/
		
		HashMap<Integer,String> hm=new HashMap<>();
		hm.put(1, "sanny");
		hm.put(0, "kumar");
		hm.put(5, "rakesh");
		hm.put(2, "mukesh");
		
		hm.entrySet().stream().forEach((i)->System.out.print(i.getKey()));
		hm.entrySet().stream().forEach((i)->System.out.print(i.getValue()));
		
		
		
		
	//	ls.forEach(System.out::println);
		
		//ls.forEach(i->System.out.print(i));
	/*	
		HashMap<Integer,String> hsmap= new HashMap<>();
		
		hsmap.put(1, "sanny");
		hsmap.put(2, "rakesh");
		hsmap.put(3, "singh");
		hsmap.put(4, "kumari");
		
		hsmap.entrySet().stream().forEach(i->System.out.print(i.getKey()));
		
	
		hsmap.entrySet().stream().forEach(i->System.out.println(i.getKey()));
		hsmap.entrySet().stream().forEach(i->System.out.println(i.getValue()));
*/
}
}