package com.india;


public class test10  extends Thread{
	
	public void run(){
		System.out.println("Test");
	}
	
	public static void main(String[] args) {
	
		String s="This is a Line";
		String[] tokens=s.split(" ");
		System.out.println(tokens.length);
	}
	
} 
