package com.india;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MapCollectionStreamTest {

	public static void main(String[] args) {
	
		HashMap<Integer,String > hs= new HashMap<Integer,String>();
		
		  hs.put(11, "Apple"); 
		  hs.put(22, "Orange"); 
		  hs.put(33, "Kiwi");  
		  hs.put(44, "Banana"); 
		
		Iterator it=hs.entrySet().iterator();
		while(it.hasNext()){
			
			Entry et=(Entry) it.next();
			System.out.println(et.getKey()+"/"+et.getValue());
			
		}
		  
		/*  HashMap<Integer,String > hsf=null;
		Iterator<Integer> it= hs.keySet().iterator();
		while(it.hasNext()){
			int key=it.next();
			System.out.println("key "+key+" -> "+hs.get(key));

		}
		  
	hs.entrySet().stream().map(i ->i.getKey()).forEach(System.out::println);
	hs.entrySet().stream().map(i ->i.getValue()).forEach(System.out::println);

		
hs.entrySet().stream().filter(i -> i.getKey()<=22).forEach(System.out::println);

hsf=(HashMap<Integer, String>) hs.entrySet().stream().filter(i -> i.getKey()>=22).collect(Collectors.toMap(i -> i.getKey(), i -> i.getValue()));

System.out.println(hsf);

*/
	}

}
