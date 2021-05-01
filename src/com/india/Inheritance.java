package com.india;

public class Inheritance {
	public static void main(String[] args) {
	
		
		Chiledclass obj1= new Chiledclass();
		obj1.method1();
		obj1.method2();
	}
}


class Parentclass{
	
	void method1(){
		System.out.println("Parent method1 called..");
	}
}

class Chiledclass extends Parentclass{
	
	void method2(){
		System.out.println("child method2 called..");
	}
}

