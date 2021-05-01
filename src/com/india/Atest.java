package com.india;

import java.util.List;
import java.util.ArrayList;

public class Atest {
	
	public static void main(String[] args) throws Exception {
		
		
		validate(6);
		
		
		
		
		
		
		
		
		/*
		String str1="sanny";
		String str2="sanny";
		System.out.println(str1.equals(str2));
		System.out.println(str1==str2);*/
		
		/*int j=0,k;

		if(j==2){
			k=5;
		}
		String str="example";
		
		System.out.println(str.substring(2,4));
		
		List<String> ls= new ArrayList<>();
		ls.add("sanny");
		ls.add("kumar");
		ls.add("singh");
		ls.add("roshan");
		ls.add("kumar");
		
		ls.stream().forEach(i ->System.out.println(i));
		
		ls.stream().forEach(System.out::println);
		ls.stream().peek(System.out::println).count();*/
		
	}

	private static void validate(int i) throws Exception  {
		
		System.out.println("calling you....");
		try {
			System.out.println("in try");
			
		} catch (Exception e) {
			
			throw new Exception();
			
		}
		
	}
}

