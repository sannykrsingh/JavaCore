package com.india;

import java.io.IOException;

public class ExceptionTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		/*
		int x=method2(10);
		System.out.println(x);*/
		
		parentexception reff= new parentexception();
		reff.methodexp1(5);
	}
}

class parentexception 
{
	
	private int x;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String name;
	public parentexception(){
		System.out.println("parentexception constructor..");
	}
	void methodexp1(int x)
	{
		System.out.println("parentexception called ..:"+x);
	}
}

class childexception extends parentexception
{
	public childexception()throws Exception
	{
		System.out.println("childexception constructor..");
	}
	
	 void methodexp1(int x)throws NullPointerException
	{
		System.out.println("childexception called ..:"+x);
	}
}








	/*static int method2(int i10)
	
	{
		try {
			
			int c= 10/0;
			System.out.println("In try block");
	        
	         return 1;
	      }
	      catch(Exception e) {
	         System.out.println("Got the  Exception " + e);
	         return 2;
	      }
		finally{
			System.out.println("finally block...");
			return 3;
			}
	//	System.out.println("sss");
		
	}
}



*/



class sannyexception extends Exception
{
	
	
}