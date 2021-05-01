package com.india.test;


class Exc0 extends Exception{}
public class Exc1 extends Exc0 {
	public static void main(String[] args) {
		try{
			throw new Exc1();
		}catch (Exc0 e) {
			System.out.println("Exc0 cauaght");
		}catch (Exception e) {
			System.out.println("exception caught");
		}
	}
}
