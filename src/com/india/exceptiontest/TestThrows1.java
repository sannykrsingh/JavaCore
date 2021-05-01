package com.india.exceptiontest;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestThrows1 {

	public static void main(String[] args) //throws IOException 
	{
		
		filewrite();
		
	}

	private static void filewrite() throws IOException {
		FileReader file = new FileReader("src\\test.txt"); 
        BufferedReader fileInput = new BufferedReader(file); 
          
        // Print first 3 lines of file "C:\test\a.txt" 
        String st; 
        while ((st = fileInput.readLine()) != null) 
          System.out.print(st); 
        
        fileInput.close(); 
		
	}  

} 