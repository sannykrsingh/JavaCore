package com.india;

public class FuctionalIntrTest {
	public static void main(String[] args) {
		
		int4 objref=(i,j) -> 
		{
			System.out.println(i);
			System.out.println(j);
			System.out.println(i*j);
			
		};
		
		objref.show(7, 8);
	}
}

interface int4
{
	
	void show(int i,int j);
}