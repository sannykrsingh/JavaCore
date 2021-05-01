package com.india;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparaterTest {
	public static void main(String[] args) {
		
	
	ArrayList al =new ArrayList<>();
	al.add(new Student(101, "sanny", new Address("bangalore")));
	al.add(new Student(105, "sadhvi", new Address("patna")));
	al.add(new Student(10, "roshan", new Address("delhi")));
	//Collections.sort(al);//al,new Addresscomparator());
	//System.out.println(al);
	Collections.sort(al,new Addresscomparator());
	System.out.println(al);
	
}

}

class Student implements Comparable<Student>
{
	public int id;
	public  String name;
	public  Address address;
	/**
	 * @param id
	 * @param name
	 * @param address
	 */
	public Student(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	@Override
	public int compareTo(Student o) {
		if(id >o.id)
			return 1;
		else if(id==o.id)
			return 0;
		else
		return -1;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	
}	
class Address{
	
	String city;

	/**
	 * @param city
	 */
	public Address(String city) {
		super();
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + "]";
	}	
	
	
}


class Addresscomparator implements Comparator<Student>
{



/*	@Override
	public int compare(Address o1, Address o2) {
		// TODO Auto-generated method stub
		return o1.city.compareTo(o2.city);
	}*/

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.address.city.compareTo(o2.address.city);
		
	}
	
}








