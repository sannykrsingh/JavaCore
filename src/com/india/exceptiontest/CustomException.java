package com.india.exceptiontest;

public class CustomException//creating checked exception 
{
	
	public static void main(String args[]){  
		//try
        //{ 
            // Throw an object of user defined exception 
            throw new MyException("my custom exception"); 
        //} 
        /*catch (MyException ex) 
        { 
            System.out.println("Caught"); 
  
            // Print the message from MyException object 
            System.out.println(ex.getMessage()); 
        } 
  */  } 
} 
		  

	class MyException extends Exception //creating checked exception
	{ 
	    public MyException(String s) 
	    { 
	        // Call constructor of parent Exception 
	        super(s); 
	    } 
	} 
