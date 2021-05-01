package com.india;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringSplitTest {
	public static void main(String[] args) throws ParseException {
	
		String strdate="15-06-1988";
		
		Date dt= new SimpleDateFormat("DD-MM-YYYY").parse(strdate);
		System.out.println(dt);
	
		String email="sann.sing@cisco.com";
		
		String name=email.substring(0,email.indexOf("@"));
		
		String[] firstlastname=name.split("\\.");
		
		System.out.println(firstlastname[0]);
		System.out.println(firstlastname[1]);
		
		for(String ne:firstlastname){
			System.out.println("firstname"+ne);
			
			
		}
		
	//	String[] name=email.split("@");
	/*	 int index=email.indexOf("@");
		  
		 String name=email.substring(0,index);
		 System.out.println(name);
		*/
		/*System.out.println(name[0]);
		
		String */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	/*		
		String str="15-06-1988";
		Date d= new SimpleDateFormat("dd-MM-yyyy").parse(str);
		System.out.println(d);

		
	String emailid="sanny.kumar@gmail.com";
	
	
	int index=emailid.indexOf("@");
	
	String emstring=emailid.substring(0,index);
	System.out.println(emstring);
	System.out.println(index);
	//email = email.substring(0,index);
	
	
	
	String emaild1="sanny.kumar.singh";
	String[] parts=emailid.split("\\.");
	System.out.println(parts[0]);
	System.out.println(parts[1]);
	System.out.println(parts[2]);
	
	
	String[] parts=emailid.split("@");
	String firstandlast;
	String[] name;
			
	if(parts.length>1){
		System.out.println("in first if");
		firstandlast=parts[0];
		System.out.println(firstandlast);
		name= firstandlast.split("\\.");
		System.out.println(name.toString());
		if(name.length>0){
			System.out.println("in 2nd if");
			System.out.println("first name : "+name[0]);
			System.out.println("last name : "+name[1]);
		}
	}
	
	//System.out.println(parts);
	
	
	if(parts.length>1){
		name=parts.
	}*/
}
}