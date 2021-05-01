package com.india;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareWithNameage {
	public static void main(String[] args) {
		
		List<StudentNew> ls= new ArrayList<>();
		
		ls.add(new StudentNew("aachi", "patna", 20));
		ls.add(new StudentNew("sanny", "bangalore", 30));
		ls.add(new StudentNew("aachi", "patna", 18));
		
		System.out.println(ls);
		Collections.sort(ls);
		System.out.println(ls);
	}
}


class StudentNew implements Comparable<StudentNew>
{
	private String name;
	private String city;
	private int age;
	public StudentNew(String name, String city, int age) {
		super();
		this.name = name;
		this.city = city;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int compareTo(StudentNew o) {
		
		int comp=this.name.compareTo(o.getName());
		if(comp==0){
			comp=Integer.compare(age,o.getAge());
		}
		return comp;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "StudentNew [name=" + name + ", city=" + city + ", age=" + age + "]";
	}
	
	
}