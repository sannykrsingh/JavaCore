package com.india;

public class ThreadTest24 {
	public static void main(String[] args) throws InterruptedException {
		
		/*Threadtest20 objt= new Threadtest20();
		objt.start();*/
		Threadtest30 objt4= new Threadtest30();
		Thread th = new Thread(objt4);
		th.start();
		
	}
}

class Threadtest30 implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<10;i++){
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
		
	}
	
	
}





class Threadtest20 extends Thread{
	
	@Override
	public void run() {
		for(int i=0;i<10;i++){
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.print(i);
		}
	}
	
	
	
}
