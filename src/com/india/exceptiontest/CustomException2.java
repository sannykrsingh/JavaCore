package com.india.exceptiontest;

public class CustomException2//creating unchecked exception 
{
	
	 public static void main(String[] args) {
		System.out.println("hhh");
	}
	/*public static void main(String args[]){  
		
            throw new MyException("my custom exception"); 
        
    } */
} 
		  

	class MyException extends RuntimeException //creating unchecked exception
	{ 
	    public MyException(String s) 
	    { 
	        // Call constructor of parent Exception 
	        super(s); 
	    } 
	} 
