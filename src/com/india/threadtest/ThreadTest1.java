package com.india.threadtest;

public class ThreadTest1 {
	public static void main(String[] args) {
		thread1 obj=new thread1();
		obj.start();
		
	}
}

class thread1 extends Thread{// creating thread using extending Thread class
	
	public void run(){  
		for(int i=0;i<10;i++){
			
			try {
				System.out.println("print i :"+i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
}