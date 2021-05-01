package com.india;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {

	public static void main(String[] args) {
		
		String email= "sannykum77777ar.s@ust-global.com";
		
		List<String> ls= new ArrayList();
		
		ls.add(email);
		
		
		//String regex="^[a-zA-Z0-9+_.-]+@[.+]$"
		//String regex="^[a-zA-Z0-9+_.-]+@(.+)$";
		
		String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.(?:[a-zA-Z]{2,6})$";
	//	.\w+\@\w+[-]\w+\\.\w+
		Pattern pattern = Pattern.compile(regex);
		 
		for(String email2 : ls){
		    Matcher matcher = pattern.matcher(email2);
		    if(matcher.matches()){
		    	 System.out.println("email is correct " + matcher.matches());
		    }else{
		    	 System.out.println("email is incorrect " + matcher.matches());
		    }
		   
		}

	}

}

