package com.india;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class ImuutableTest {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		cal.set(1982, 4, 21); 
		
		Date birthDate = cal.getTime();

		
			
		List ls = new ArrayList<>(); 
		ls.add("sanny"); 
		ls.add("kumar");
		ls.add("singh");
		testmenu tsmenu= new testmenu("sanny", birthDate,ls);
		System.out.println("Before updating- "+tsmenu);
		Date bday=tsmenu.getBirthday();
		bday.setTime(System.currentTimeMillis());
		List orginls = tsmenu.getLs();
		orginls.remove(0);
		ls.add("ku..........");
		System.out.println("After updating- "+tsmenu);
		
		
	}
}


final class testmenu
{
	private final String name;
	private final Date birthday;
	private final List ls;

	public testmenu(String name, Date birthday, List ls) {
		this.name = name;
		this.birthday = birthday;
		this.ls = ls;
	}

	
	private String getName() {
		return name;
	}


	public Date getBirthday() {
		return (Date) birthday.clone();
	}


	public List getLs() {
		//return ls;
		return Collections.unmodifiableList(ls);
	}


	@Override
	public String toString() {
		return "testmenu [name=" + name + ", birthday=" + birthday + ", ls=" + ls + "]";
	}

	
}