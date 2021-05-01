package com.india.part2;

public class CountInstace {
	public static void main(String[] args) {
		instacncount ob1= new instacncount();
		instacncount ob2= new instacncount();
		instacncount ob3= new instacncount();
		instacncount ob4= new instacncount();
		instacncount ob5= new instacncount();
		System.out.println(instacncount.count);
	}
}



class instacncount{
	
	static int count;
	
	public instacncount(){
		System.out.println(count);
		count++;
		
	}
}