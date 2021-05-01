package com.india.exceptiontest;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Trywithresoucre {
	public static void main(String[] args) throws FileNotFoundException {
		
		 
        
		 FileReader file = new FileReader("src\\test.txt"); 
		 
        try(BufferedReader fileInput = new BufferedReader(file)){
        	
        	 String st; 
             while ((st = fileInput.readLine()) != null) 
               System.out.println(st); 
        	
        }catch(Exception e){
        	e.printStackTrace();
        }
		
		
	}
}
