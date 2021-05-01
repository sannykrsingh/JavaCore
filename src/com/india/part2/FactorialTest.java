package com.india.part2;

public class FactorialTest {
	public static void main(String[] args) {
	//fibonacci series
		/*
		int a=0;
		int b=1;
		int c = 0;
		System.out.print(a);
		for(int i=0;i<10;i++){
			a=b;
			b=c;
			c=a+b;
			System.out.print(" ,"+c);
		}*/
		
		/*int factorial=1;
		
		for(int i=1;i<=5;i++){
			factorial=factorial*i;
		}
		System.out.println(factorial);*/
		
		String rev=reversestring("sanny");
		System.out.println(rev);
		
	}

	private static String reversestring(String str) {
		
		if(str.isEmpty()){
			return str;
		}else{
			return reversestring(str.substring(1))+str.charAt(0);
		}
	
		
		
	}
}
