package com.india;

public class FunctionalInterface {
	public static void main(String[] args) {
		
		functionint reff1 = () -> {
						System.out.println("functional interface called 1..");
						System.out.println("functional interface called 2..");
						System.out.println("functional interface called 3..");
						System.out.println("functional interface called 4..");
					
					};
			
			reff1.show();
					
	}
}



interface functionint
{
	void show();
}