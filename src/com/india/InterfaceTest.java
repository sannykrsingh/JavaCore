package com.india;

public class InterfaceTest {
 public static void main(String[] args) {
	
	/* functionintrExp obj=(i)->{
		System.out.println("implementation of interface..");
		System.out.println("value of x="+i);
	 };
	 
	 obj.functionalmethod1(10);
	*/
	 
	 testdefaultinterfce obj1= new  testdefaultinterfce();
	 obj1.sannyMethod();
}
}


 
/*interface functionintrExp{
	
	void functionalmethod1(int x);
	
	
}*/


interface defaultinterface1
{
	default void sannyMethod(){
		System.out.println("default method. from defaultinterface1");
	}
	
	
}

interface defaultinterface2
{
	default void sannyMethod(){
		System.out.println("default method..from defaultinterface2");
	}
	
	
}


class testdefaultinterfce implements defaultinterface1,defaultinterface2
{

	
	public void sannyMethod() {
		System.out.println("i m from class ");
	}
	
	
}


/*
interface intr1
{
	//void method1();
	
	default void method2(){
		System.out.println("default method..in intr1");
	}
	
	default void method23(){
		System.out.println("default method..in intr1");
	}
	
}

class a implements intr1{

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}
	
}*/