package com.india;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EmailRegexCheck {
	public static void main(String[] args) throws ParseException {
		
		
		
		SimpleDateFormat sm= new SimpleDateFormat("MM-dd-yyyy");
		
		Date d=sm.parse("09-09-2018");
		
		Date withoutformat =sm.parse(sm.format(new Date()));
		
		System.out.println(withoutformat);
		
		System.out.println(d);
		
		DateFormat dateFormat2 = new SimpleDateFormat("MM-dd-yyyy");
		System.out.println(dateFormat2.format(new Date()));
		
		/*String email1="sannykumar.s@hcl.com";
		String email2="sanny%%kum#@hcl.com";
		
		String regex="^[a-zA-Z0-9+_.-]+@(.+)$";
		Pattern pt= Pattern.compile(regex);
		
		Matcher mt=pt.matcher(email2);
		
		
		if(mt.matches()){
			System.out.println("email is correct...");
		}else{
			System.out.println("email is invalid...");
		}*/
		
	}
}
