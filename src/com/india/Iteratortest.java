package com.india;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class Iteratortest {

	public static void main(String[] args) {
		
		
		List<Integer> ls= new CopyOnWriteArrayList<>();
		ls.add(5);
		ls.add(6);
		ls.add(7);
		ls.add(8);
		ls.add(9);
		ls.add(10);
		
		Iterator it= ls.iterator();
		while(it.hasNext()){
		
		ls.remove(new Integer(10));
		System.out.println(it.next());
		}
		
		System.out.println(ls);
	}

}
