package com.india;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamMapTest {

	public static void main(String[] args) throws Exception {
		
		//Without stream API
		ArrayList<Integer> ls= new ArrayList<Integer>(); 
		ArrayList<Integer> lseven= new ArrayList<Integer>(); 
		ls.add(0);ls.add(10);ls.add(20);ls.add(5);ls.add(15);
		/*System.out.println(ls);*/
		for(int i:ls){
			if(i%2==0)
				lseven.add(i);
		}
		System.out.println(lseven);
		
		ls.stream().map(i -> i*2).forEach(System.out::println);
		
		
		//After Stream API
		 //lseven=ls.stream().filter(i ->i%2==0).collect(Collectors.toList());
		lseven=(ArrayList<Integer>) ls.stream().map(i->i*2).collect(Collectors.toList());
		System.out.println(lseven);
		
		/*String datest="15-06-1988";
		Date dt= new SimpleDateFormat("dd-mm-yyyy").parse(datest);
		
		Calendar cal = Calendar. getInstance();
		cal. setTime(dt);
		System.out.println(cal.getTimeInMillis());
		
		System.out.println(dt);*/
	}

}
