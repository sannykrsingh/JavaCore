package com.india.test;

public class TestProg {
	 public static void main(String[] args) {
		try{
			badmethod();
			System.out.println("A");
		}catch(Exception ex){
			System.out.println("B");
		}finally{
			System.out.println("c");
		}
		System.out.println("D");
		
	}

	private static void badmethod() {
		// TODO Auto-generated method stub
		
	}
}
