package com.india;

public class DefaultintrTest {
		public static void main(String[] args) {
			interfaceT obj1= new interface2Impl();
			obj1.method1();
			obj1.method3();
		
			
		}
}



interface interfaceT{
	
	 default void method1(){
		
		System.out.println("my default method1");
	}
	
	default void method3(){
		System.out.println("my default method2");
		
	}
}


class interface2Impl implements interfaceT{
	
}

/*interface interfaceT
{
	default void method1() {
		System.out.println("my first default method1");
	}
	
	default void method3() {
		System.out.println("my first default method2");
	}
	
}

class interface2Impl implements interfaceT

{
	
	
}*/