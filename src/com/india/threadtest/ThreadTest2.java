package com.india.threadtest;

public class ThreadTest2 {
	public static void main(String[] args) {
		
		
		thread2 obj=new thread2();
		Thread th= new Thread(obj);
		th.start();// we can not start thread twice
	
		
	}
}


class thread2 implements Runnable //creating thread using runnable interface
{
	
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