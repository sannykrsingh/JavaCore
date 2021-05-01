package com.india;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComperatorTest {
	public static void main(String[] args) {
		
		ArrayList al =new ArrayList<>();
		al.add(new student1(109, "anny", "bangalore"));
		al.add(new student1(102, "kumarisadhvi", "bangalore"));
		al.add(new student1(106, "rakesh", "bangalore"));
		System.out.println(al);
		Collections.sort(al,new namesort());
		System.out.println(al);
		
	}
}

class student1 implements Comparable
{
	int id;
	String name;
	String city;
	public student1(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}
	@Override
	public int compareTo(Object o) {
		student1 stu1=(student1) o;
		if(this.id>stu1.id)
			return 1;
		else if(this.id==stu1.id)
			return 0;
		else return -1;
	}
	@Override
	public String toString() {
		return "student1 [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	
	
}


class namesort implements Comparator<student1>{

	@Override
	public int compare(student1 o1, student1 o2) {
		
		return o1.name.compareTo(o2.name);
	}
	
}





























/*class student1 implements Comparable
{
	int rollno;
	String name;
	int age;
	public student1(int rollno, String name, int age) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "student [rollno=" + rollno + ", name=" + name + ", age=" + age + "]";
	}
	@Override
	public int compareTo(Object o) {
		
		student1 s=(student1) o;
		if(rollno>s.rollno)
			return 1;
		else if(rollno==s.rollno)
			return 0;
		else 
		return -1;
	}
}
	class namesorttest implements Comparator
	{

		@Override
		public int compare(Object o1, Object o2) {
			
			student1 s=(student1) o1;
			student1 s2=(student1) o2;
			
			return s.name.compareTo(s2.name);
		}
		
		
		
	}
		
*/