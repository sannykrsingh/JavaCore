package com.india;

public class DoubleCheckSingleton {
	public static void main(String[] args) {
		
		Doublesingleton obj1= Doublesingleton.getInstance();
		Doublesingleton obj2= Doublesingleton.getInstance();
		System.out.println(obj1);
		System.out.println(obj2);
	}
}


class Doublesingleton
{
	private Doublesingleton(){
		System.out.println("constructor called..");
		
	}
	static Doublesingleton doublesingleton;
	
	static Doublesingleton getInstance(){
		
		if(doublesingleton==null){
			synchronized (Doublesingleton.class) {
				if(doublesingleton==null){
					doublesingleton =new Doublesingleton();
				}
			}
			
		}
			
		
		return doublesingleton;
		
	}
	
	
	
}






/*
class Doublesingleton
{
	
	static Doublesingleton doublesingletonobj;
	
		
	public static Doublesingleton getInstance(){
		
		if(doublesingletonobj==null){
			synchronized(Doublesingleton.class) {
				if(doublesingletonobj==null)
					doublesingletonobj= new Doublesingleton();
			}
			
		}
		
		return doublesingletonobj;
		
	}
	
	
	
}*/