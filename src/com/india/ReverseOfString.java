package com.india;

public class ReverseOfString {
	public static void main(String[] args) {
		
		String name="my name is sanny";
		String reverse="";
		
		String[] revearr=name.split(" ");
		System.out.println(revearr[3]);

		System.out.println(revearr.length);
		for(int i=revearr.length-1; i>=0; i--)
		{
			
		reverse=reverse +revearr[i];
		}
		
		
		System.out.println(reverse);
		
	}
}
