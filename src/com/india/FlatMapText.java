package com.india;

import java.util.stream.Collectors;
import java.util.*;

public class FlatMapText {
	public static void main(String[] args) {
		
		List<Integer> ls1=Arrays.asList(2,4,6,7);
		List<Integer> ls2=Arrays.asList(1,3,5,7);
		
	//	List<List<Integer>> finallist=Arrays.asList(ls1,ls2);
		//System.out.println(finallist);

		List<List<Integer>> ls= new ArrayList<>();
		
		ls.add(ls1);
		ls.add(ls2);
		
		
		
		
		
		
		
	//	List<List<Integer>> ls= new ArrayList();
		ls.add(ls1);
		ls.add(ls2);
		System.out.println(ls);
		
	
		List finallist2= ls.stream().flatMap(i->i.stream()).collect(Collectors.toList());
		System.out.println(finallist2);
		
		List finallist3=ls.stream().map(i->i.stream()).collect(Collectors.toList());
		
		System.out.println(finallist3);
		
		//List finallist2=ls.stream().flatMap(i ->i.stream()).collect(Collectors.toList());
		
	//	List finallist2=ls.stream().flatMap(i -> i.stream()).collect(Collectors.toList());
        // Using flatMap for transformating and flattening.
	//	List finallist2=ls.stream().flatMap(i -> i.stream()).collect(Collectors.toList());
			
	//	System.out.println(finallist2);
		//List<Integer> listofInts  =  finallist.stream().flatMap(list -> list.stream()).collect(Collectors.toList());
		
		
	}
}
