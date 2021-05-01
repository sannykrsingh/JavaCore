package com.india.test;

public class Constractur {
	static String str;
		public void Constractur(){
			System.out.println("constrcutor called..");
			str="hello world";
		}
	public static void main(String[] args) {
		Constractur c= new Constractur();
		System.out.println(str);
	}
}
