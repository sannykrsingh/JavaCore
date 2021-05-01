package com.india;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonTest {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		
		Sigletest obj1=Sigletest.getInstance();
		//Sigletest obj2=Sigletest.getInstance();
		ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream("singtext.txt"));
		oos.writeObject(obj1);
		
		ObjectInputStream ois= new ObjectInputStream(new FileInputStream("singtext.txt"));
		Sigletest obj2=(Sigletest) ois.readObject();
		System.out.println(obj1);
		System.out.println(obj2);
		
		Sigletest instance2 = null;
		Constructor[] conss=Sigletest.class.getDeclaredConstructors();
		for(Constructor cs: conss){
			cs.setAccessible(true);
			instance2=(Sigletest) cs.newInstance();
		}
		
		System.out.println(instance2);
		
	}
}

class Sigletest implements Serializable{
	
		private Sigletest(){
		
		}
	static Sigletest sigletest;
	
	public static Sigletest getInstance(){
		if(sigletest==null)
			sigletest= new Sigletest();
		
		return sigletest;
	}
	
	private Object readResolve() {
		 return sigletest;

	}
	
}