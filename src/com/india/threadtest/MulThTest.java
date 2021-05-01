package com.india.threadtest;

public class MulThTest {
	
	public static void main(String[] args) throws InterruptedException {
		
	
	multhread1 obj1= new multhread1();
	multhread2 obj2=new multhread2();
	obj1.start();
	
	
  obj1.join(); // join method
  obj2.start();
	
	
	}
}


class multhread1 extends Thread{// creating thread using extending Thread class
	
	public void run(){  
		for(int i=0;i<10;i++){
			
			try {
				System.out.println("multhread1 printing i :"+i);
				Thread.sleep(1000); //sleeping the tread for 1 sec
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	}
}

class multhread2 extends Thread{// creating thread using extending Thread class
	
	public void run(){  
		for(int i=0;i<10;i++){
			
			try {
				System.out.println("multhread2 printing :"+i);
				Thread.sleep(1000);
				//wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	}
}