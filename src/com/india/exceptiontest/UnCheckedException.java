package com.india.exceptiontest;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class UnCheckedException {

	public static void main(String args[])// throws IOException
	
	{  	
		//int s=10/0;
		
		int ar[] = {1, 2, 3, 4, 5}; 
       
          System.out.println(ar[0]); 
          System.out.println(ar[1]); 
          System.out.println(ar[2]); 
          System.out.println(ar[3]); 
          System.out.println(ar[4]);
          System.out.println(ar[5]);
		 
	}  
		
} 