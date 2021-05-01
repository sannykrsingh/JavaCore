package com.india;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparaterTest2 {
	public static void main(String[] args) {
		
		
		ArrayList arrst=new ArrayList<>();
		arrst.add(new Studenttest(109,"sanny","bangalore"));
		arrst.add(new Studenttest(101,"shalu","patna"));
		arrst.add(new Studenttest(102,"ravi","bangalore"));
		arrst.add(new Studenttest(107,"aaa","chennai"));
		arrst.add(new Studenttest(102,"dd","delhi"));		
		Collections.sort(arrst,new studentcomparator());
		System.out.println(arrst);
		
	}
}


class studentcomparator implements Comparator<Studenttest>

{

	@Override
	public int compare(Studenttest o1, Studenttest o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
	
}





class Studenttest{
	
	private int id;
	private String name;
	private String address;
	public Studenttest(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Studenttest [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
}


/*class Studenttest implements Comparable<Studenttest>{
	
	private int id;
	private String name;
	private String address;
	public Studenttest(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Studenttest [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	@Override
	public int compareTo(Studenttest o) {
		if(id>o.id)
			return 1;
		else if(id==o.id)
			return 0;
		else
			return -1;
		}
}*/