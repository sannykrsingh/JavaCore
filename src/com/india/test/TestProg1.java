package com.india.test;

public class TestProg1 {
	static final Integer i1=1;
	final Integer i2=2;
	Integer i3=3;
	public static void main(String[] args) {
		 final Integer i4=4;
		 Integer i5=5;
		 
		 class inner{
			 final Integer i6=6;
			 Integer i7=7;
			 public inner() {
				System.out.println(i6+i7);
			}
		 }
	}
}
