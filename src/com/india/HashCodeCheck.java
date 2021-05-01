package com.india;

public class HashCodeCheck {
	public static void main(String[] args) {
		
		String str1="AaBB";
		String str2="BBAa";
		
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
	}
}
