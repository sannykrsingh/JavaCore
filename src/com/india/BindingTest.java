package com.india;

public class BindingTest {

	public static void main(String[] args) {
		
		/*parentclass pc= new childclass();
		pc.print();*/
		
		childclass cc=(childclass) new parentclass();
		cc.print();
		

	}

}

class parentclass
{
	void print(){
		System.out.println("parent class called..");
	}
}

class childclass extends parentclass
{
	void print(){
		System.out.println("child class called..");
	}
}