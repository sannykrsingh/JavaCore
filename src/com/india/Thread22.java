package com.india;

public class Thread22 {
	public static void main(String[] args) {
		exptest1 obj2= new exptest1();
		obj2.start();
		
		for(int i=0;i<20;i++){
			System.out.println("Main thread..");
		}
		
	}
}

class exptest1 extends Thread
{
	public void run(){
		try {
			exptest1.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=0;i<20;i++){
			System.out.println("chaild thread..");
		}
	}
	
}