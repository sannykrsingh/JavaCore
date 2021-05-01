package com.india;

public class FabTest {

	public static void main(String[] args) {
		
		int a=0;
		int b=0;
		int c=1;
		for(int i=0;i<20;i++){
			
			a=b;
			b=c;
			c=a+b;
			
			System.out.print(a+",");
		}
		/*int a=0;
		int b=0;
		int c=1;
		for(int i=0;i<20;i++){
			a=b;
			b=c;
			c=a+b;
			System.out.print(" "+a);
		}*/
		

	}

}
